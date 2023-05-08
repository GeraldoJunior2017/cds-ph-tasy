package br.com.mv.cdsphtasy.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Encounter {

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
    private String integrationSource;
    private String healthInsuranceId;
    private String healthInsuranceName;
    private String clientKey;
    private String ansCode;
    private String procedureType;
    private String procedureId;
    private String procedureDescription;
    private LocalDate dateOfBirth;
    private String documentType;
    private String documentId;
    private String phoneMobile;
    private Boolean retroactive;
    private String agent;
    private List<Exam> exams;
    private List<Surgery> surgeries;
    private List<MedicalRecord> medicalRecords;
    private String patientId;
    private String nr_ddd_celular;

}
