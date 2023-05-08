package br.com.mv.cdsphtasy.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MedicalRecordDto {

    private String healthProfessional;
    private String accreditationNumber;
    private String accreditation;
    private LocalDateTime signatureDate;
    private Long medicalRecordId;
    private String medicalRecordName;
    private String medicalRecordType;
    private String medicalRecordFileName;
    private String medicalRecordCode;
    private String idObject;

}
