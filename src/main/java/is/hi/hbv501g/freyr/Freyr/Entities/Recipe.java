package is.hi.hbv501g.freyr.Freyr.Entities;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "RECIPE")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
    private String instructions;
    private double rating;
    private String image;
    private int readyInMinutes;
    private int servings;
    private ArrayList<String> ingredients = new ArrayList<String>();
    // private ArrayList<Recipe> favorite; //á þetta nokkuð að vera hér?

    // ------------------- Constructor ----------------------------

    public Recipe() {
    }

    public Recipe(String title, int id, String image) {
        this.title = title;
        this.id = id;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;

    }


   /* public int getIngredientsMiss() {
        return ingredientsMiss;
    }

    public void setIngredientsMiss(int ingredientsMiss) {
        this.ingredientsMiss = ingredientsMiss;

    }*/
    public void setIngredients(String ingredients) {
        this.ingredients.add(ingredients);
    }

    public ArrayList<String> getIngredients(){
        return this.ingredients;
    }

    @Override
    public String toString(){
        String s = "ID: "+this.id+"  Title: "+this.title+"  Image: "+this.image;
        return s;
    }
}
