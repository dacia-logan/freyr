package is.hi.hbv501g.freyr.Freyr.Controllers;

import com.mashape.unirest.http.exceptions.UnirestException;
import is.hi.hbv501g.freyr.Freyr.Services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class recipeController {

    private RecipeService recipeService;

    /*
    @Autowired
    public recipeController(RecipeService recipeService){
        this.recipeService = recipeService;
    }
*/
    @RequestMapping("/")
    public String Home() throws UnirestException {
        //RecipeMapper a = new RecipeMapper();
        //a.getResultsTitle("burger");
        return "home";
    }

    @RequestMapping("login")
    public String Login(){
        return "login";
    }

}
