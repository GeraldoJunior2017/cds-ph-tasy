package br.com.mv.cdsphtasy.repositories;

import br.com.mv.cdsphtasy.models.InsuranceCategoryService;
import br.com.mv.cdsphtasy.models.InsuranceCategoryServiceId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface InsuranceCategoryServiceRepository extends JpaRepository<InsuranceCategoryService, InsuranceCategoryServiceId> {

    @Query(value = "select a.* from atend_categoria_convenio a where a.nr_atendimento = ?", nativeQuery = true)
    Optional<InsuranceCategoryService> findByNrAtendimento(Long nrAtendimento);

}
