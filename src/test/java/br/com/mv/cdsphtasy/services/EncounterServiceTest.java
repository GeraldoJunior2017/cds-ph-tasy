package br.com.mv.cdsphtasy.services;

import br.com.mv.cdsphtasy.dtos.EncounterDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class EncounterServiceTest {

    @Autowired
    EncounterService encounterService;

    @Test
    void testFindEncounter() {
        Long encounterCode = 34545780L;
        EncounterDto encounter = encounterService.findEncounter(encounterCode);
        Assert.notNull(encounter.getIntegrationCode(), "testFindEncounter");
    }
}