package br.com.mv.cdsphtasy.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class DiseaseDiagnosisId implements Serializable {

    @Column(name = "NR_ATENDIMENTO")
    private Long nrAtendimento;
    @Column(name = "DT_DIAGNOSTICO")
    private LocalDateTime dtDiagnostico;
    @Column(name = "CD_DOENCA")
    private String cdDoenca;

}
