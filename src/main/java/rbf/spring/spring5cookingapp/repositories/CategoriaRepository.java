package rbf.spring.spring5cookingapp.repositories;

import org.springframework.data.repository.CrudRepository;
import rbf.spring.spring5cookingapp.models.Categoria;

public interface CategoriaRepository extends CrudRepository<Categoria, Long> {
}
