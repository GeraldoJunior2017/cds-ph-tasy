package br.com.mv.cdsphtasy.services;

import br.com.mv.cdsphtasy.dtos.EncounterDto;
import br.com.mv.cdsphtasy.models.DiseaseDiagnosis;
import br.com.mv.cdsphtasy.models.InsuranceCategoryService;
import br.com.mv.cdsphtasy.models.PatientService;
import br.com.mv.cdsphtasy.models.Procedure;
import br.com.mv.cdsphtasy.repositories.DiseaseDiagnosisRepository;
import br.com.mv.cdsphtasy.repositories.InsuranceCategoryServiceRepository;
import br.com.mv.cdsphtasy.repositories.PatientServiceRepository;
import br.com.mv.cdsphtasy.repositories.ProcedureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class EncounterService {

    @Autowired
    private PatientServiceRepository patientServiceRepository;
    @Autowired
    private ProcedureRepository procedureRepository;
    @Autowired
    private DiseaseDiagnosisRepository diseaseDiagnosisRepository;
    @Autowired
    private InsuranceCategoryServiceRepository insuranceCategoryServiceRepository;

    public EncounterDto findEncounter(Long encounterCode) {
        return this.entityToDto(encounterCode);
    }

    private EncounterDto entityToDto(Long encounterCode) {
        PatientService patientService = patientServiceRepository
                .findById(encounterCode)
                .orElse(new PatientService());
        Optional<List<Procedure>> proceduresList = procedureRepository.findByNrAtendimento(patientService.getIntegrationCode());
        //TODO: verificar campo CD_DOENCA, talvez venha da prescrição
        Optional<DiseaseDiagnosis> diseaseDiagnosis = diseaseDiagnosisRepository.findByNrAtendimento(encounterCode);
        Optional<InsuranceCategoryService> insuranceCategoryService = insuranceCategoryServiceRepository.findByNrAtendimento(encounterCode);

        return EncounterDto.entityToDto(
                patientService,
                patientService.getEstablishment(),
                proceduresList.orElse(Collections.singletonList(new Procedure())).get(0),
                patientServiceRepository.obterDescricaoSetorAtendimento(patientService.getAttendanceUnit())
        );
    }
}
