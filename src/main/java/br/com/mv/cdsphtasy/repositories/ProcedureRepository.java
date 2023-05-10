package br.com.mv.cdsphtasy.repositories;

import br.com.mv.cdsphtasy.models.Procedure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProcedureRepository extends JpaRepository<Procedure, Long> {

    Optional<List<Procedure>> findByNrAtendimento(Long nrAtendimento);

    @Query(value = "select obter_valor_dominio(?, ?) from dual", nativeQuery = true)
    String obterValorDominio(Long cdDominio, String ieOrigemProced);

    @Query(value = "select obter_desc_procedimento(?, ?) from dual", nativeQuery = true)
    String obterDescProcedimento(Long cdProcedimento, String ieOrigemProced);

}
