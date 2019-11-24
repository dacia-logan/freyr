package is.hi.hbv501g.freyr.Freyr.Services.Implementations;

import com.mashape.unirest.http.exceptions.UnirestException;
import is.hi.hbv501g.freyr.Freyr.Entities.Recipe;
import is.hi.hbv501g.freyr.Freyr.Repositories.RecipeRepository;
import is.hi.hbv501g.freyr.Freyr.Services.RecipeService;
import is.hi.hbv501g.freyr.Freyr.Utilities.RecipeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class RecipeServiceImplementation implements RecipeService {

    RecipeRepository recipeRepo;
    RecipeMapper mapper = new RecipeMapper();
    List<Recipe> results = new ArrayList<Recipe>();
    Recipe selectedRecipe;

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
    public Recipe findById(Integer id) {
        return recipeRepo.findById(id).orElse(null);
    }

    @Override
    public ArrayList<Recipe> findAll() {
        return recipeRepo.findAll();
    }


    /*@Override
    public ArrayList<Recipe> findByUserId(Integer id){ return  recipeRepo.findByUserId(id);}*/


    @Override
    public ArrayList<Recipe> getResults(String title) throws UnirestException {
        this.results = mapper.getResultsTitle(title);
        return (ArrayList<Recipe>) this.results;
    }


    @Override
    public void setSelectedRecipe(int i) {
        this.selectedRecipe = this.results.get(i);
    }

    @Override
    public Recipe getSelectedRecipe(){
        return this.selectedRecipe;
    }

    @Override
    public void getDetails(Recipe recipe) throws UnirestException {
        this.mapper.getDetails(recipe);
    }
}
