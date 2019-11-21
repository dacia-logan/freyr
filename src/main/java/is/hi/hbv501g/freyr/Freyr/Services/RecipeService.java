package is.hi.hbv501g.freyr.Freyr.Services;

import com.mashape.unirest.http.exceptions.UnirestException;
import is.hi.hbv501g.freyr.Freyr.Entities.Recipe;

import java.util.ArrayList;

public interface RecipeService {
    Recipe save(Recipe recipe);
    void delete(Recipe recipe);
    Recipe findById(Integer id);
    ArrayList<Recipe> findAll();
    ArrayList<Recipe> findByUserId(Integer id);
    ArrayList<Recipe> getResults(String title) throws UnirestException;

}
