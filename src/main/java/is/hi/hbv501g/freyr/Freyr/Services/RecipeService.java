package is.hi.hbv501g.freyr.Freyr.Services;

import is.hi.hbv501g.freyr.Freyr.Entities.Recipe;

import java.util.ArrayList;

public interface RecipeService {
    Recipe save(Recipe recipe);
    void delete(Recipe recipe);
    Recipe findById(int id);
    ArrayList<Recipe> findAll();
}
