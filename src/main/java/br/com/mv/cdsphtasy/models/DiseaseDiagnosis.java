package br.com.mv.cdsphtasy.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "DIAGNOSTICO_DOENCA")
public class DiseaseDiagnosis {

    @EmbeddedId
    private DiseaseDiagnosisId diseaseDiagnosisId;
    @ManyToOne
    @JoinColumn(name = "CD_DOENCA", insertable = false, updatable = false)
    private CidDoenca cidDoenca;

}
