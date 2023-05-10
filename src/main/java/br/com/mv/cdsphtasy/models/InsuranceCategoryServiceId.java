package br.com.mv.cdsphtasy.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class InsuranceCategoryServiceId implements Serializable {

    @Column(name = "NR_ATENDIMENTO")
    private Long nrAtendimento;
    @Column(name = "CD_CONVENIO")
    private Long cdConvenio;
    @Column(name = "CD_CATEGORIA")
    private String cdCategoria;
    @Column(name = "DT_INICIO_VIGENCIA")
    private LocalDateTime dtInicioVigencia;

}
