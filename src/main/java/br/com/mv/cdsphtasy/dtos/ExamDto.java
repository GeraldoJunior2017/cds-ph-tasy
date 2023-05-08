package br.com.mv.cdsphtasy.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExamDto {

    private Long examIntegrationId;
    private String examType;
    private Long examRequisitionId;
    private LocalDateTime examRequisitionDate;
    private LocalDateTime collectDate;
    private LocalDateTime examResultDate;
    private Long healthInsuranceId;
    private String healthInsuranceName;
    private String ansCode;
    private Long establishmentId;
    private Long establishmentCNES;
    private String attendanceUnit;
    private String orderingPhysician;
    private String orderingPhysicianAccreditationNumber;
    private String orderingPhysicianAccreditation;
    private String reporterPhysician;
    private String reporterPhysicianAccreditationNumber;
    private String reporterPhysicianAccreditation;
    private Long examCode;
    private String examTussCode;
    private String examDescription;
    private Long accessNumber;
    private String resultUrl;
    private String dicomUrl;
    private String establishmentName;
    private String attendanceId;
    private String reportCode;
    private String patientName;
    private String patientId;

}
