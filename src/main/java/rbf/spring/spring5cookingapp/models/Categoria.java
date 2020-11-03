package rbf.spring.spring5cookingapp.models;

import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Set;

@EqualsAndHashCode
@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

//    @ManyToMany(mappedBy = "categories")
//    private Set<Receita> receitas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
