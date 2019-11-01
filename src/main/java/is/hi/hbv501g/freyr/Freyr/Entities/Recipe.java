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
    private String image;
    private int readyInMinutes;
    private int servings;
    private int ingredientsHit;
    private int ingredientsMiss;
    //private ArrayList<Recipe> favorite; // todo er þetta nokkuð rétt? - held að þetta eigi ekki heima hér, vitlaust í Diagraminu okkar?


    public Recipe(String title) {
        this.title = title;
    }

    public Recipe(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getReadyInMinutes() {
        return readyInMinutes;
    }

    public void setReadyInMinutes(int readyInMinutes) {
        this.readyInMinutes = readyInMinutes;
    }

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
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

    @Override
    public String toString(){
        String s = this.id+" "+this.title;
        return s;
    }
}
