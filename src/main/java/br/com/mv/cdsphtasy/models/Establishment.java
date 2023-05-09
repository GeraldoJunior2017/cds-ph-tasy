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

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ESTABELECIMENTO")
public class Establishment {

    @Id
    @Column(name = "CD_ESTABELECIMENTO", length = 4)
    private Long establishmentId;
    @Column(name = "NM_FANTASIA_ESTAB", length = 50)
    private String establishmentName;

}
