package is.hi.hbv501g.freyr.Freyr.Controllers;

import com.mashape.unirest.http.exceptions.UnirestException;
import is.hi.hbv501g.freyr.Freyr.Entities.Recipe;
import is.hi.hbv501g.freyr.Freyr.Services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.validation.BindingResult;

import javax.validation.Valid;
import java.util.ArrayList;

@Controller
public class recipeController {

    private RecipeService recServ;

    @Autowired
    public recipeController(RecipeService recipeServices){
        this.recServ = recipeServices;
    }

    // sets up the basic home page
    @RequestMapping("/")
    public String Home(){
        return "home";
    }

    // shows in detail the recipe that was clicked
    @RequestMapping(value="/recipe", method=RequestMethod.GET)
    public String recipeInformation(Recipe clickedRecipe, Model model){
        // todo taka út þessa prufu
        clickedRecipe = createFakeRecipe();

        //þetta er sniðugt ef við viljum ekki byrta bara arrayList í html-inu
        //það þarf að búa til hlutinn data svo að ingredients byrtist rétt í html
        //ArrayList<String> data = clickedRecipe.getIngredients();
        //model.addAttribute("ingredients", data);
        model.addAttribute("recipe", clickedRecipe);
        return "recipe";
    }

    // shows in detail the recipe that was clicked
    // if the user wishes to save the recipe to favorites
    // the method will save that recipe and it will be
    // accessible in a list of the users favorite recipes
    @RequestMapping(value="/recipe", method=RequestMethod.POST)
    public String addToFavorites(@Valid Recipe recipe, BindingResult result, Model model)  {
        // todo taka út þessa prufu
        recipe = createFakeRecipe();

        if(result.hasErrors()){
            return "recipe";
        }
        Recipe exists = recServ.findById(recipe.getId());
        if (exists == null) {
            recServ.save(recipe);
        }
        model.addAttribute("recipe", recipe);
        return "/recipe";
    }

    // todo taka út þegar recipes hlutir eru klárir í slaginn
    // býr til gerfi recipe hlut
    public Recipe createFakeRecipe(){
        Recipe clickedRecipe = new Recipe();
        clickedRecipe.setId(1);
        clickedRecipe.setTitle("Lasagne");
        clickedRecipe.setIngredients("pasta");
        clickedRecipe.setIngredients("tomatoes");
        clickedRecipe.setInstructions("some text some text some text some text some text some text some text some text some text some text some text some text some text some text");
        clickedRecipe.setReadyInMinutes(10);
        clickedRecipe.setServings(3);
        clickedRecipe.setRating(5.0);
        clickedRecipe.setImage("https://images.pexels.com/photos/2765875/pexels-photo-2765875.jpeg?cs=srgb&dl=baked-close-up-creamy-2765875.jpg&fm=jpg");
        return clickedRecipe;
    }

    // sets up and shows all favorite recipes of the user
    @RequestMapping(value="/favoriteRecipes", method=RequestMethod.GET)
    public String favoriteRecipe(Model model){
        model.addAttribute("recipes", recServ.findAll());
        return "/favoriteRecipes";
    }

    @RequestMapping(value="search", method=RequestMethod.GET)
    public String Searched(){
        return "search";
    }

    @RequestMapping(value = "/search", method=RequestMethod.POST)
    public String typeSearch(@RequestParam(required=false, value="foodType") String foodType, Model model) throws UnirestException {
        //todo Tekur við því sem notandinn slær inn og sendir það á mapperinn
        //todo Hægt að commenta þetta út á þá má sjá uppskriftina prenntast út á skipanalínu

        recServ.getResults(foodType);
        model.addAttribute("recipes", recServ.getResults(foodType));
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
