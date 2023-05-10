package br.com.mv.cdsphtasy.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ATENDIMENTO_PACIENTE")
public class PatientService {

    @Id
    @Column(name = "NR_ATENDIMENTO", length = 10)
    private Long integrationCode;
    //"operation":"I",
    @ManyToOne
    @JoinColumn(name = "CD_ESTABELECIMENTO")
    private Establishment establishment;
    @Column(name = "CD_SETOR_OBITO")
    private Long attendanceUnit;
    /*
    "type":"",
    */
    @ManyToOne
    @JoinColumn(name = "CD_MEDICO_ATENDIMENTO", referencedColumnName = "CD_PESSOA_FISICA")
    private PhysicalPerson encounterPhysician;
    @Column(name = "DT_ENTRADA")
    private LocalDateTime createdDate;
    @Column(name = "DT_INICIO_ATENDIMENTO")
    private LocalDateTime initDate;
    @ManyToOne
    @JoinColumn(name = "CD_PESSOA_FISICA")
    private PhysicalPerson physicalPerson;

}
