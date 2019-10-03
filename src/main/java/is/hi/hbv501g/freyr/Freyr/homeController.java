package is.hi.hbv501g.freyr.Freyr;

import is.hi.hbv501g.freyr.Freyr.Services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class homeController {

    /*private RecipeService recipeService;

    @Autowired
    public homeController(RecipeService recipeService){
        this.recipeService = recipeService;
    }*/

    @RequestMapping("/")
    public String Home(){
        return "home";
    }

    @RequestMapping("login")
    public String Login(){
        return "login";
    }
}
