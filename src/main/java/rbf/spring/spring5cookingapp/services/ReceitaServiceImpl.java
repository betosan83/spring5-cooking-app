package rbf.spring.spring5cookingapp.services;

import org.springframework.stereotype.Service;
import rbf.spring.spring5cookingapp.models.Receita;
import rbf.spring.spring5cookingapp.repositories.ReceitaRepository;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class ReceitaServiceImpl implements ReceitaService {

    private final ReceitaRepository receitaRepository;

    public ReceitaServiceImpl(ReceitaRepository receitaRepository) {
        this.receitaRepository = receitaRepository;
    }

    @Override
    public Set<Receita> getRecipes() {
        Set<Receita> recipeSet = new HashSet<>();
        receitaRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }

    @Override
    public Receita findById(Long l) {
        Optional<Receita> recipeOptional = receitaRepository.findById(l);

        if (!recipeOptional.isPresent()) {
            throw new RuntimeException("Recipe Not Found!");
        }

        return recipeOptional.get();
    }
}
