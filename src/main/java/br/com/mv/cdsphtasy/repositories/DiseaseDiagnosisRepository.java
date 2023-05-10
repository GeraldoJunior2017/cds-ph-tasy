package br.com.mv.cdsphtasy.repositories;

import br.com.mv.cdsphtasy.models.DiseaseDiagnosis;
import br.com.mv.cdsphtasy.models.DiseaseDiagnosisId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface DiseaseDiagnosisRepository extends JpaRepository<DiseaseDiagnosis, DiseaseDiagnosisId> {

    @Query(value = "select a.* from diagnostico_doenca a where a.nr_atendimento = ?", nativeQuery = true)
    Optional<DiseaseDiagnosis> findByNrAtendimento(Long nrAtendimento);

}
