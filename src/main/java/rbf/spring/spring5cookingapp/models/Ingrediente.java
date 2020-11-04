package rbf.spring.spring5cookingapp.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
public class Ingrediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;
    private BigDecimal quantidade;

    @OneToOne(fetch = FetchType.EAGER)
    private UnidadeDeMedida uom;

    @ManyToOne
    private Receita receita;

    public Ingrediente(String descricao, BigDecimal quantidade) {
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    public Ingrediente() {}


}
