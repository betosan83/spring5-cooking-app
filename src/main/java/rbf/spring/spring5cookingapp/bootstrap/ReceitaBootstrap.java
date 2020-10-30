package rbf.spring.spring5cookingapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import rbf.spring.spring5cookingapp.models.Ingrediente;
import rbf.spring.spring5cookingapp.models.Receita;
import rbf.spring.spring5cookingapp.repositories.ReceitaRepository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class ReceitaBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    
    private final ReceitaRepository receitaRepository;

    public ReceitaBootstrap(ReceitaRepository receitaRepository) {
        this.receitaRepository = receitaRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        receitaRepository.saveAll(getRecipes());
    }

    private List<Receita> getRecipes() {
        List<Receita> listaDeReceitas = new ArrayList<Receita>();
        Receita receitaDeLasanha = new Receita();
        receitaDeLasanha.setDescricao("Perfect Guacamole");
        receitaDeLasanha.setTempoPreparo(10);
        receitaDeLasanha.setTempoCozimento(0);
        receitaDeLasanha.setDirecoes("Comprar a massa, cozinhar, adicionar molho, carne, tempero e comer");

        receitaDeLasanha.getIngredientes().add(new Ingrediente("pimenta", new BigDecimal(10)));

        listaDeReceitas.add(receitaDeLasanha);

        return listaDeReceitas;
    }
}
