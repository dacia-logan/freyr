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
    private int id;
    private String title;
    private int readyInMinutes;
    private int servings;
    private String image;
    private String description;

    // ------------------- Constructor ----------------------------

    public Recipe() {
    }

    public Recipe(String title, String description, Double rating) {

    }

    // ------------------- Getters & Setters ----------------------


    public long getId() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


    @Override
    public String toString(){
        String s = this.id+" "+this.title;
        return s;
    }
}
