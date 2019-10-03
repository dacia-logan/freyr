package is.hi.hbv501g.freyr.Freyr.Repositories;


import is.hi.hbv501g.freyr.Freyr.Entities.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {

    /*
    fallið mun taka við recipe objecti og vista í gagnagrunninn
    allur kóði við sql skipunina gerist sjálfkrafa
    JPA sér um allt á bakvið tjöldin
     */
    Recipe save(Recipe recipe);
    List<Recipe> findAll();
    List<Recipe> findByName(String name);
}
