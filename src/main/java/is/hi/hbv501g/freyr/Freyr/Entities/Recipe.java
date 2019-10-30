package is.hi.hbv501g.freyr.Freyr.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String instructions;
    private double rating;
    // private Image image; // todo finna út hvernig við geymum mynd
    private String readyInMin;
    private int ingredientsHit;
    private int ingredientsMiss;
    //private ArrayList<Recipe> favorite; // todo er þetta nokkuð rétt? - held að þetta eigi ekki heima hér, vitlaust í Diagraminu okkar?


    // notum fyrir fyrsta kall smiðinn

    public Recipe(String title) {
        this.title = title;
    }

    // notum fyrir seinni köll til að bæta við hlutinn getters og setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getReadyInMin() {
        return readyInMin;
    }

    public void setReadyInMin(String readyInMin) {
        this.readyInMin = readyInMin;
    }

    public int getIngredientsHit() {
        return ingredientsHit;
    }

    public void setIngredientsHit(int ingredientsHit) {
        this.ingredientsHit = ingredientsHit;
    }

    public int getIngredientsMiss() {
        return ingredientsMiss;
    }

    public void setIngredientsMiss(int ingredientsMiss) {
        this.ingredientsMiss = ingredientsMiss;
    }
}
