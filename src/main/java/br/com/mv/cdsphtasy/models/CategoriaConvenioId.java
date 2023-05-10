package br.com.mv.cdsphtasy.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class CategoriaConvenioId implements Serializable {

    @Column(name = "CD_CONVENIO")
    private Long cdConvenio;
    @Column(name = "CD_CATEGORIA")
    private Long cdCategoria;

}
