package is.hi.hbv501g.freyr.Freyr.Controllers;

import is.hi.hbv501g.freyr.Freyr.Entities.User;
import is.hi.hbv501g.freyr.Freyr.Services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class userController {

    UserService userService;

    @RequestMapping("signup")
    public String SignUp() { return "signup";}

    @RequestMapping("user")
    public String User() { return "user";}


    // SIGNUP FUNCTIONS

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
            System.out.println(user.getUserName());
            System.out.println(user.getPassword());
        }
        model.addAttribute("users", userService.findAll());
        return "home";
    }

    // LOGIN FUNCTIONS
}
