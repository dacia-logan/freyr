package is.hi.hbv501g.freyr.Freyr.Entities;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String userName;
    private String email;
    private String password;

    //@OneToMany(mappedBy = "user")
    private ArrayList<Recipe> favorite = new ArrayList<>();

    public User(long id, String userName, String email, String password, ArrayList<Recipe> favorite) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.favorite = favorite;
    }

    public User(long id, String userName, String email, String password) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public User() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public ArrayList<Recipe> getFavorite() {
        return favorite;
    }

    public void setFavorite(ArrayList<Recipe> favorite) {
        this.favorite = favorite;
    }

}
