package br.com.mv.cdsphtasy.services;

import br.com.mv.cdsphtasy.dtos.EncounterDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EncounterServiceTest {

    @Autowired
    EncounterService encounterService;

    @Test
    void getEncounter() {
        EncounterDto encounter = encounterService.getEncounter();
        encounter.getIntegrationCode();
    }
}