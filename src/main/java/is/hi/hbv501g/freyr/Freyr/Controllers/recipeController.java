package is.hi.hbv501g.freyr.Freyr.Controllers;

import com.mashape.unirest.http.exceptions.UnirestException;
import is.hi.hbv501g.freyr.Freyr.Services.RecipeService;
import is.hi.hbv501g.freyr.Freyr.Utilities.RecipeMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

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
        // todo kommentaði út því ég vil ekki gera óþarfa köll
        /*RecipeMapper a = new RecipeMapper();
        ArrayList<String> s = new ArrayList<>();
        s.add("egg");
        s.add("milk");
        a.getResultsTitle("burger");*/
        return "home";
    }

    @RequestMapping("login")
    public String Login(){
        return "login";
    }



}
