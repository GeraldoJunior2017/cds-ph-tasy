package br.com.mv.cdsphtasy.controller;

import br.com.mv.cdsphtasy.dtos.EncounterDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("intercept")
public class InterceptRequestController {

    @GetMapping("/encounter")
    public ResponseEntity<EncounterDto> getEncounter() {
        return ResponseEntity.ok(new EncounterDto());
    }
}
