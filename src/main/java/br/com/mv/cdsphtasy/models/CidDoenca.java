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
@Table(name = "CID_DOENCA")
public class CidDoenca {

    @Id
    @Column(name = "CD_DOENCA_CID")
    private String cidCode;
    @Column(name = "CD_VERSAO")
    private String cidVersion;
    @Column(name = "DS_DOENCA_CID")
    private String cidDescription;

}
