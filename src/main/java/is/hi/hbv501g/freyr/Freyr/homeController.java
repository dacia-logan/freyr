package is.hi.hbv501g.freyr.Freyr;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import is.hi.hbv501g.freyr.Freyr.Entities.Recipe;
import is.hi.hbv501g.freyr.Freyr.Services.Implementations.RecipeServiceImplementation;
import is.hi.hbv501g.freyr.Freyr.Services.RecipeService;
import is.hi.hbv501g.freyr.Freyr.Utilities.RecipeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

@Controller
public class homeController {

    private RecipeService recipeService;

    /*
    @Autowired
    public homeController(RecipeService recipeService){
        this.recipeService = recipeService;
    }
*/
    @RequestMapping("/")
    public String Home() throws UnirestException {
        RecipeMapper a = new RecipeMapper();
        ArrayList<String> s = new ArrayList<>();
        s.add("egg");
        s.add("milk");
        Recipe rec = new Recipe();
        rec.setId(156992);
        a.getResultsTitle("burger");
        return "home";
    }

    @RequestMapping("login")
    public String Login(){
        return "login";
    }
}
