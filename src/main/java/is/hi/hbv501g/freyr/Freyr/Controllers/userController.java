package is.hi.hbv501g.freyr.Freyr.Controllers;

import is.hi.hbv501g.freyr.Freyr.Entities.User;
import is.hi.hbv501g.freyr.Freyr.Services.RecipeService;
import is.hi.hbv501g.freyr.Freyr.Services.UserService;
import is.hi.hbv501g.freyr.Freyr.Utilities.AlertsToUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
public class userController {

    private UserService userService;
    private RecipeService recipeService;
    private AlertsToUser alertsToUser = new AlertsToUser(); // this is one of the utilities classes

    @Autowired
    public userController(UserService userService, RecipeService recipeService) {
        this.userService = userService;
        this.recipeService = recipeService;
    }

    // USER PAGE FUNCTIONS

    /**
     * @param model
     * @return redirects to user page where all users can be seen
     */
    @RequestMapping("/user")
    public String User(Model model) {
        model.addAttribute("users", userService.findAll());
        return "user";
    }


    // SIGNUP PAGE FUNCTIONS

    /**
     * @param user
     * @return redirects to home page
     */
    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String signUpGET(User user){
        return "signup";
    }

    // sign up page
    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String signUpPOST(@Valid User user, BindingResult result, Model model){
        if(result.hasErrors()){
            return "signup";
        }

        String message = "Username already exists";
        User exists = userService.findByUserName(user.getUserName());

        if(exists == null){
            model.addAttribute("recipes",recipeService.findAll());
            userService.save(user);
            return "home";
        }

        model.addAttribute("message", message);
        return "signup";
    }

    // login page setup
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginGET(User user, Model model){
        return "login";
    }

    // identifies the user if exists and returns to home page
    // else shows a message to the user informing him about the error
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginPOST(@Valid User user, BindingResult result, Model model, HttpSession session){

        if(result.hasErrors()){
            return "login";
        }

        String message = "Incorrect user information or user does not exist";
        User exists = userService.validate(user);

        if (exists != null) {
            user = userService.findByUserName(user.getUserName());
            model.addAttribute("recipes",recipeService.findAll());
            session.setAttribute("LoggedInUser", user);
            return "home";
        }

        model.addAttribute("message", message);
        return "login";
    }

    // shows the user name of the user that is logged in
    @RequestMapping(value = "/loggedin", method = RequestMethod.GET)
    public String loggedinGET(HttpSession session, Model model){
        User sessionUser = (User) session.getAttribute("LoggedInUser");
        if(sessionUser != null){
            model.addAttribute("loggedinuser", sessionUser);
            return "loggedInUser";
        }
        return "home";
    }
}
