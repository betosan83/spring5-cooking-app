package rbf.spring.spring5cookingapp.models;

import javax.persistence.*;
import java.util.Set;

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

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "receita")
    private Set<Ingrediente> ingredientes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getTempoPreparo() {
        return tempoPreparo;
    }

    public void setTempoPreparo(Integer tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }

    public Integer getTempoCozimento() {
        return tempoCozimento;
    }

    public void setTempoCozimento(Integer tempoCozimento) {
        this.tempoCozimento = tempoCozimento;
    }

    public Integer getPorcoes() {
        return porcoes;
    }

    public void setPorcoes(Integer porcoes) {
        this.porcoes = porcoes;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDirecoes() {
        return direcoes;
    }

    public void setDirecoes(String direcoes) {
        this.direcoes = direcoes;
    }

    public Set<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Set<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
