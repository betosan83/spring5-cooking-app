package rbf.spring.spring5cookingapp.repositories;

import org.springframework.data.repository.CrudRepository;
import rbf.spring.spring5cookingapp.models.Receita;

public interface ReceitaRepository extends CrudRepository<Receita, Long> {
}
