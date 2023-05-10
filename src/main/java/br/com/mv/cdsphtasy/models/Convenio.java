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
@Table(name = "CONVENIO")
public class Convenio {

    @Id
    @Column(name = "CD_CONVENIO")
    private String healthInsuranceId;
    @Column(name = "DS_CONVENIO")
    private String healthInsuranceName;

}
