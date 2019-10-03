package is.hi.hbv501g.freyr.Freyr.Services.Implementations;

import is.hi.hbv501g.freyr.Freyr.Entities.Recipe;
import is.hi.hbv501g.freyr.Freyr.Repositories.RecipeRepository;
import is.hi.hbv501g.freyr.Freyr.Services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RecipeServiceImplementation implements RecipeService {

    RecipeRepository repository;

    @Autowired
    public RecipeServiceImplementation(RecipeRepository recipeRepository){
        this.repository = recipeRepository;
    }

    @Override
    public Recipe save(Recipe recipe) {
        return repository.save(recipe);
    }

    @Override
    public List<Recipe> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Recipe> findByName(String name) {
        return repository.findByName(name);
    }
}
