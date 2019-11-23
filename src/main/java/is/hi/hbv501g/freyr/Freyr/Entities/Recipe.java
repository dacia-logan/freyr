package is.hi.hbv501g.freyr.Freyr.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Set;

@Entity
@Table(name = "recipe")
public class Recipe {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private String instructions;
    private double rating;
    private String image;
    private int readyInMinutes;
    private int servings;
    private ArrayList<String> ingredients = new ArrayList<String>();

    @ManyToMany(mappedBy = "favorite")
    private Set<User> userId;



    // ------------------- Constructor ----------------------------

    public Recipe() {
    }

    public Recipe(String title, Integer id, String image) {
        this.title = title;
        this.id = id;
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public void addUser(User user){
        userId.add(user);
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
