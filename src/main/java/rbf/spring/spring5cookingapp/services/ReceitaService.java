package rbf.spring.spring5cookingapp.services;



import rbf.spring.spring5cookingapp.models.Receita;

import java.util.Set;

public interface ReceitaService {

    Set<Receita> getRecipes();

    Receita findById(Long l);
}
