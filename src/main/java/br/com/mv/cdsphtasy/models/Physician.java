package br.com.mv.cdsphtasy.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;
import javax.persistence.Transient;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "MEDICO")
public class Physician {

    @Id
    @Column(name = "CD_PESSOA_FISICA")
    private String cdMedico;
    @Transient
    private String specialityName;
    /*@JoinTable(joinColumns = {
            @JoinColumn(name = "NM_PESSOA_FISICA", table = "PESSOA_FISICA")
    })
    private String healthPractitioner;*/
    @Column(name = "NR_CRM_NUMERICO", length = 38)
    private Long accreditationNumber;
    @Column(name = "NR_CRM")
    private String accreditation;

}
