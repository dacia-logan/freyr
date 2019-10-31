package is.hi.hbv501g.freyr.Freyr.Controllers;

import is.hi.hbv501g.freyr.Freyr.Entities.User;
import is.hi.hbv501g.freyr.Freyr.Services.RecipeService;
import is.hi.hbv501g.freyr.Freyr.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class userController {

    private UserService userService;
    private RecipeService recipeService;

    @Autowired
    public userController(UserService userService) {
        this.userService = userService;
        this.recipeService = new RecipeService();
    }

    // USER PAGE FUNCTIONS

    @RequestMapping("/user")
    public String User(Model model) {
        model.addAttribute("users", userService.findAll());
        return "user";
    }


    // SIGNUP PAGE FUNCTIONS

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String signUpGET(User user){
        return "signup";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String signUpPOST(@Valid User user, BindingResult result, Model model){
        if(result.hasErrors()){
            return "signup";
        }
        User exists = userService.findById(user.getId());
        if(exists == null){
            userService.save(user);
        }
        model.addAttribute("recipes", recipeService.findAll());
        return "home";
    }

    // LOGIN PAGE FUNCTIONS
}
