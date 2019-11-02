package is.hi.hbv501g.freyr.Freyr.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class Recipe {

    // hér koma allar tilviksbreytur t.d
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private int readyInMinutes;
    private int servings;
    private String image;
    private String instructions;
    private ArrayList<String> ingredients = new ArrayList<String>();
    // ------------------- Constructor ----------------------------

    public Recipe() {
    }

    public Recipe(String title, String instructions, Double rating) {

    }

    // ------------------- Getters & Setters ----------------------


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

    public void setServings(int servings){
        this.servings=servings;
    }

    public int getServings(){
        return servings;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setIngredients(String ingredient){
        this.ingredients.add(ingredient);
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
