package is.hi.hbv501g.freyr.Freyr.Services;

import is.hi.hbv501g.freyr.Freyr.Entities.Recipe;
import is.hi.hbv501g.freyr.Freyr.Entities.User;

import java.util.ArrayList;
import java.util.List;

public interface UserService {

    User save(User user);
    void changePassword(User user, String newPassword);
    void delete(User user);
    User findById(long id);
    Boolean validate(long id, String password);
    ArrayList<Recipe> getFavorites(String title);

    List<User> findAll();

}
