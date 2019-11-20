package is.hi.hbv501g.freyr.Freyr.Services.Implementations;

import is.hi.hbv501g.freyr.Freyr.Entities.Recipe;
import is.hi.hbv501g.freyr.Freyr.Repositories.RecipeRepository;
import is.hi.hbv501g.freyr.Freyr.Services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;



@Service
public class RecipeServiceImplementation implements RecipeService {

    RecipeRepository recipeRepo;

    @Autowired
    public RecipeServiceImplementation(RecipeRepository recipeRepo) {
        this.recipeRepo = recipeRepo;
    }

    @Override
    public Recipe save(Recipe recipe) {
        return recipeRepo.save(recipe);
    }


    @Override
    public void delete(Recipe recipe) {
        recipeRepo.delete(recipe);
    }

    @Override
    public Recipe findById(int id) {
        return recipeRepo.findById(id).orElse(null);
    }

    @Override
    public ArrayList<Recipe> findAll() {
        return recipeRepo.findAll();
    }
}
