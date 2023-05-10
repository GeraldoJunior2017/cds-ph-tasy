package br.com.mv.cdsphtasy.dtos;

import br.com.mv.cdsphtasy.models.Establishment;
import br.com.mv.cdsphtasy.models.PatientService;
import br.com.mv.cdsphtasy.models.Procedure;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EncounterDto {

    private Long integrationCode;
    private String operation;
    private String establishmentId;
    private String establishmentName;
    private String establishmentCNES;
    private String attendanceUnit;
    private String type;
    private String specialityName;
    private String healthPractitioner;
    private String accreditationNumber;
    private String accreditation;
    private String createdDate;
    private String initDate;
    private String cidVersion;
    private String cidCode;
    private String cidDescription;
    private Boolean death;
    private String integrationSource = "STACASAPOA";
    private String healthInsuranceId;
    private String healthInsuranceName;
    private String clientKey = "stacasapoa";
    private String ansCode;
    private String procedureType;
    private String procedureId;
    private String procedureDescription;
    private LocalDate dateOfBirth;
    private String documentType;
    private String documentId;
    private String phoneMobile;
    private Boolean retroactive = false;
    private String agent = "CDS-TASY";
    private List<ExamDto> exams;
    private List<SurgeryDto> surgeries;
    private List<MedicalRecordDto> medicalRecords;
    private String patientId;
    private String nr_ddd_celular;

    @JsonIgnore
    public static EncounterDto entityToDto (
            PatientService patientService,
            Establishment establishment,
            Procedure procedure,
            String descricaoSetorAtendimento
    ) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        EncounterDto encounterDto = EncounterDto.builder()
                .integrationCode(patientService.getIntegrationCode())
                .establishmentId(establishment.getEstablishmentId().toString())
                .establishmentName(establishment.getEstablishmentName())
                .establishmentCNES(patientService.getPhysicalPerson().getEstablishmentCNES())
                .createdDate(patientService.getCreatedDate().format(dateTimeFormatter))
                //.initDate(patientService.getInitDate().format(dateTimeFormatter))
                .attendanceUnit(descricaoSetorAtendimento)
                //.procedureType(procedureRepository.obterValorDominio(30L, procedure.getIeOrigem()))
                //.procedureDescription(procedureRepository.obterDescProcedimento(procedure.getProcedureId(), procedure.getIeOrigem()))
                .build();
        return encounterDto;
    }

}
