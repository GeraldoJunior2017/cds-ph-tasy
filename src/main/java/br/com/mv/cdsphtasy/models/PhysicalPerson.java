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
import javax.persistence.Transient;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PESSOA_FISICA")
public class PhysicalPerson {

    @Id
    @Column(name = "CD_PESSOA_FISICA")
    private String patientId;
    @Column(name = "NR_DDD_CELULAR")
    private String nr_ddd_celular;
    @Column(name = "DT_NASCIMENTO")
    private LocalDate dateOfBirth;
    @Transient
    private String documentType = "CPF";
    @Column(name = "NR_CPF")
    private String documentId;
    @Column(name = "NR_TELEFONE_CELULAR")
    private String phoneMobile;
    @Column(name = "DT_OBITO")
    private LocalDate dtDeath;
    @ManyToOne
    @JoinColumn(name = "CD_MEDICO", referencedColumnName = "CD_PESSOA_FISICA")
    private Physician physician;
    @Column(name = "CD_CNES")
    private String establishmentCNES;

    public boolean isDeath() {
        return dtDeath != null;
    }
}
