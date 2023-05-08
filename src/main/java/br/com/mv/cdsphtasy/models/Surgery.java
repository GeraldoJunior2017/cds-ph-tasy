package br.com.mv.cdsphtasy.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Surgery {

    private Long surgeryWarningId;
    private Long surgeryId;
    private Long tussProcedureId;
    private String surgeryDescription;
    private String mainSurgeon;
    private String accreditationNumber;
    private String accreditation;

}
