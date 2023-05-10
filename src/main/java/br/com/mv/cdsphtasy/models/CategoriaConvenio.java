package br.com.mv.cdsphtasy.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CATEGORIA_CONVENIO")
public class CategoriaConvenio {

    @EmbeddedId
    private CategoriaConvenioId categoriaConvenioId;
    @ManyToOne
    @JoinColumn(name = "CD_CONVENIO", insertable = false, updatable = false)
    private Convenio convenio;

}
