package is.hi.hbv501g.freyr.Freyr.Services.Implementations;

import is.hi.hbv501g.freyr.Freyr.Entities.Recipe;
import is.hi.hbv501g.freyr.Freyr.Entities.User;
import is.hi.hbv501g.freyr.Freyr.Repositories.UserRepository;
import is.hi.hbv501g.freyr.Freyr.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImplementation implements UserService {

    UserRepository userRepo;

    @Autowired
    public UserServiceImplementation(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public User save(User user) {
        return userRepo.save(user);
    }

    @Override
    public void changePassword(User user, String newPassword) {
        // todo útfæra þetta
    }

    @Override
    public void delete(User user) {
        userRepo.delete(user);
    }

    @Override
    public User findById(long id) {
        return userRepo.findById(id).orElse(null);
    }

    @Override
    public Boolean validate(long id, String password) {
        // todo útfæra þetta
        return null;
    }

    @Override
    public ArrayList<Recipe> getFavorites(String title) {
        // todo útfæra þetta
        return null;
    }

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }
}
