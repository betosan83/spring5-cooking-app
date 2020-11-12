package rbf.spring.spring5cookingapp.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
public class Receita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;
    private Integer tempoPreparo;
    private Integer tempoCozimento;
    private Integer porcoes;
    private String origem;
    private String url;
    private String direcoes;

    @Enumerated(value = EnumType.STRING)
    private Dificuldade dificuldade;

    @OneToOne(cascade = CascadeType.ALL)
    private Anotacoes anotacoes;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "receita")
    private Set<Ingrediente> ingredientes;


}
