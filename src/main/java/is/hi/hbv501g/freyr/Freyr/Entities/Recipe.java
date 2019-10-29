package is.hi.hbv501g.freyr.Freyr.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Recipe {

    // hér koma allar tilviksbreytur t.d
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;
    private String description;
    private Double rating;
    private int servings;

    // ------------------- Constructor ----------------------------

    public Recipe() {
    }

    public Recipe(String title, String description, Double rating) {

    }

    // ------------------- Getters & Setters ----------------------

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public void setServings(int servings){
        this.servings=servings;
    }

    public int getServings(){
        return servings;
    }
}
