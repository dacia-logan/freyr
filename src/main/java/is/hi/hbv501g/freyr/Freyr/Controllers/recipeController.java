package is.hi.hbv501g.freyr.Freyr.Controllers;

import com.mashape.unirest.http.exceptions.UnirestException;
import is.hi.hbv501g.freyr.Freyr.Entities.Recipe;
import is.hi.hbv501g.freyr.Freyr.Services.RecipeService;
import is.hi.hbv501g.freyr.Freyr.Utilities.RecipeMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String Home(){
        return "home";
    }

    @RequestMapping("login")
    public String Login(){
        return "login";
    }

    //Nær í search síðuna
    @RequestMapping(value="search", method=RequestMethod.GET)
    public String Searched(){
        return "search";
    }

    @RequestMapping(value = "/search", method=RequestMethod.POST)
    public String typeSearch(@RequestParam(required=false, value="foodType") String foodType, Model model) throws UnirestException {
        //todo Tekur við því sem notandinn slær inn og sendir það á mapperinn
        //todo Hægt að commenta þetta út á þá má sjá uppskriftina prenntast út á skipanalínu

        //RecipeMapper rMap = new RecipeMapper();
        //rMap.getResultsTitle(foodType);
        return "search";
    }

    /*
    Þurfum svo annan controller fyrir að velja ingredients síðar
        RecipeMapper a = new RecipeMapper();
        ArrayList<String> s = new ArrayList<>();
        s.add("egg");
        s.add("milk");
        Recipe rec = new Recipe();
        rec.setId(156992);
        a.getResultsTitle("burger");
    @RequestMapping

     */
    


}
