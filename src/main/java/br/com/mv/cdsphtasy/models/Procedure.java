package br.com.mv.cdsphtasy.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PROCEDIMENTO_PACIENTE")
public class Procedure {

    @Id
    @Column(name = "NR_SEQUENCIA")
    private Long nrSequence;
    @Column(name = "NR_ATENDIMENTO")
    private Long nrAtendimento;
    @Column(name = "CD_PROCEDIMENTO")
    private Long procedureId;
    @Column(name = "IE_ORIGEM_PROCED")
    private String ieOrigem;

}
