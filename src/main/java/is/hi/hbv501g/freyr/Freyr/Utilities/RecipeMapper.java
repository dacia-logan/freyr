package is.hi.hbv501g.freyr.Freyr.Utilities;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import is.hi.hbv501g.freyr.Freyr.Entities.Recipe;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RecipeMapper {
  // main course, side dish, dessert, appetizer, salad, bread, breakfast, soup,

    public void getResultsIngr(List<String> ingr){

    }

    public ArrayList<Recipe> getResultsTitle(String title/*, String type*/) throws UnirestException {
        HttpResponse<String> response = Unirest.get("https://spoonacular-recipe-food-nutrition-v1.p.rapidapi.com/recipes/search?number=1&offset=0&type=main%20course&query="+title)
                .header("x-rapidapi-host", "spoonacular-recipe-food-nutrition-v1.p.rapidapi.com")
                .header("x-rapidapi-key", "95e63d77d8mshcd6163a94d2be7bp15c756jsn981c624f96fc")
                .asString();

        System.out.print( response.getBody());
        this.jsonToRecipe(response.getBody());
        ArrayList<Recipe> recipes = new ArrayList<Recipe>();
        return recipes;
    }
    @JsonIgnoreProperties(ignoreUnknown=true)
    private ArrayList<Recipe> jsonToRecipe(String json){
        ObjectMapper mapper = new ObjectMapper();
        ArrayList<Recipe> recipes = new ArrayList<Recipe>();
        try {
            // JSON string to Java object
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            String jsonInString = json;
            Recipe staff2 = mapper.readValue(jsonInString, Recipe.class);

            // compact print
            System.out.println(staff2);

            // pretty print
            String prettyStaff1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff2);

            System.out.println(prettyStaff1);

            recipes.add(staff2);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return recipes;
    }


}
