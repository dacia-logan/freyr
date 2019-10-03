package is.hi.hbv501g.freyr.Freyr.Services;

import is.hi.hbv501g.freyr.Freyr.Entities.Recipe;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RecipeService {
    Recipe save(Recipe recipe);
    List<Recipe> findAll();
    List<Recipe> findByName(String name);

    /*
    Hér geta svo komið flóknari föll og queries
     */
}
