package br.com.mv.cdsphtasy.services;

import br.com.mv.cdsphtasy.dtos.EncounterDto;
import br.com.mv.cdsphtasy.models.Establishment;
import br.com.mv.cdsphtasy.models.PatientService;
import br.com.mv.cdsphtasy.repositories.PatientServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.format.DateTimeFormatter;

@Service
public class EncounterService {

    @Autowired
    private PatientServiceRepository patientServiceRepository;

    public EncounterDto getEncounter() {
        return this.pToe();
    }

    private EncounterDto pToe() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        PatientService patientService = patientServiceRepository.findById(34545780L).orElse(new PatientService());
        EncounterDto encounterDto = new EncounterDto();
        encounterDto.setIntegrationCode(patientService.getIntegrationCode());
        Establishment establishment = patientService.getEstablishment();
        encounterDto.setEstablishmentId(establishment.getEstablishmentId().toString());
        encounterDto.setEstablishmentName(establishment.getEstablishmentName());
        encounterDto.setEstablishmentCNES(patientService.getPhysicalPerson().getEstablishmentCNES());
        encounterDto.setCreatedDate(patientService.getCreatedDate().format(dateTimeFormatter));
        //encounterDto.setInitDate(patientService.getInitDate().format(dateTimeFormatter));
        return encounterDto;
    }

}
