package br.com.mv.cdsphtasy.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Lazy;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ATEND_CATEGORIA_CONVENIO")
public class InsuranceCategoryService {

    @EmbeddedId
    private InsuranceCategoryServiceId insuranceCategoryServiceId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "CD_CONVENIO", insertable = false, updatable = false),
            @JoinColumn(name = "CD_CATEGORIA", insertable = false, updatable = false)
    })
    private CategoriaConvenio categoriaConvenio;
    //atendimento_paciente --> atend_categoria_convenio --> convenio (CD_ANS)
    //@Column(name = "CD_ANS")
    //private String ansCode;

}
