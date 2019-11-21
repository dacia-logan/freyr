package is.hi.hbv501g.freyr.Freyr.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String userName;
    private String email;
    private String password;

    @ManyToMany
    @JoinTable(name = "fav_recipes", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "recipe_id"))
    private Set<Recipe> favorite;

    public User(Integer id, String userName, String email, String password, Set<Recipe> favorite) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.favorite = favorite;
    }

    public User(Integer id, String userName, String email, String password) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public User() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Recipe> getFavorite() {
        return favorite;
    }

    public void setFavorite(Recipe favorite) {
        this.favorite.add(favorite);
    }

}
