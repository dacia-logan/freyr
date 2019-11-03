package is.hi.hbv501g.freyr.Freyr.Repositories;

import is.hi.hbv501g.freyr.Freyr.Entities.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.Optional;

public interface RecipeRepository extends JpaRepository<Recipe, int> {

    Recipe save(Recipe recipe);
    void delete(Recipe recipe);
    Recipe findById(int id);
    ArrayList<Recipe> findAll();
}