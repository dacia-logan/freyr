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

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

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

    /**
     * @param user
     * @param result
     * @param model
     * @return redirects to home page
     */
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

    /**
     * @param user
     * @return login page
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginGET(User user){
        return "login";
    }

    /**
     * reviews the userName and password and if results have errors returns the login page again,
     * else it returns the home page and the user is signed in
     * @param user
     * @param result
     * @param model
     * @param session
     * @return home page or login
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginPOST(@Valid User user, BindingResult result, Model model, HttpSession session){
        if(result.hasErrors()){
            return "login";
        }
        model.addAttribute("recipes",recipeService.findAll());
        User exists = userService.validate(user);
        if(exists != null){
            session.setAttribute("LoggedInUser", user);
            return "home";
        }
        return "home";
    }

    /**
     * shows the user name of the user that is logged in
     * @param session
     * @param model
     * @return home page
     */
    @RequestMapping(value = "/loggedin", method = RequestMethod.GET)
    public String loggedinGET(HttpSession session, Model model){

        model.addAttribute("recipes",recipeService.findAll());
        User sessionUser = (User) session.getAttribute("LoggedInUser");
        if(sessionUser  != null){
            model.addAttribute("loggedinuser", sessionUser);
            return "loggedInUser";
        }
        return "home";
    }
}
