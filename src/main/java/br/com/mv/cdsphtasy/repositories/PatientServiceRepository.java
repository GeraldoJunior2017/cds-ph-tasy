package br.com.mv.cdsphtasy.repositories;

import br.com.mv.cdsphtasy.models.PatientService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientServiceRepository extends JpaRepository<PatientService, Long> {

    @Query(value = "select obter_desc_setor_atend(?) from dual", nativeQuery = true)
    String obterDescricaoSetorAtendimento(Long cdSetorAtendimento);

}
