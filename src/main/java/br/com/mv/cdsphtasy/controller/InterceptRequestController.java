package br.com.mv.cdsphtasy.controller;

import br.com.mv.cdsphtasy.dtos.EncounterDto;
import br.com.mv.cdsphtasy.services.EncounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/intercept")
public class InterceptRequestController {

    @Autowired
    private EncounterService encounterService;

    @GetMapping("/encounter")
    public ResponseEntity<EncounterDto> findEncounter(Long encounterCode) {
        return ResponseEntity.ok(encounterService.findEncounter(encounterCode));
    }
}
