package rbf.spring.spring5cookingapp.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Anotacoes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String descricao;

    @Lob
    private Byte[] imagem;

    @OneToOne
    private Receita receita;

    public void setId(Long id) {
        this.id = id;
    }


}
