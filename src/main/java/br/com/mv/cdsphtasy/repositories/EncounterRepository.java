package br.com.mv.cdsphtasy.repositories;

import br.com.mv.cdsphtasy.models.Encounter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EncounterRepository extends JpaRepository<Encounter, Long> {
}
