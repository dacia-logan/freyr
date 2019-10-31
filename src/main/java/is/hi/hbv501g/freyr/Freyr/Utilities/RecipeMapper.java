package is.hi.hbv501g.freyr.Freyr.Utilities;


import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import is.hi.hbv501g.freyr.Freyr.Entities.Recipe;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;


public class RecipeMapper {
    // main course, side dish, dessert, appetizer, salad, bread, breakfast, soup,
    private String baseUri = "https://spoonacular.com/recipeImages/";
    public ArrayList<Recipe> getResultsIngr(ArrayList<String> ingr) throws UnirestException {
        String ingredients = "";
        if(ingr.size()==1){
            ingredients = ingr.get(0);
        }
        else {
            for (int i = 0; i < ingr.size(); i++) {
                if (i == ingr.size()-1){
                    ingredients+=ingr.get(i);
                }
                else {
                    ingredients += ingr.get(i) + "%2C";
                }
            }
        }
        HttpResponse<String> response = Unirest.get("https://spoonacular-recipe-food-nutrition-v1.p.rapidapi.com/recipes/findByIngredients?number=5&ranking=1&ignorePantry=false&ingredients="+ingredients)
                .header("x-rapidapi-host", "spoonacular-recipe-food-nutrition-v1.p.rapidapi.com")
                .header("x-rapidapi-key", "95e63d77d8mshcd6163a94d2be7bp15c756jsn981c624f96fc")
                .asString();

        ArrayList<Recipe> recipes = this.ingrResultsToRecipe("{results :"+response.getBody()+"}");
        System.out.println( response.getBody());
        return recipes;
    }

    public ArrayList<Recipe> getResultsTitle(String title/*, String type*/) throws UnirestException {
        HttpResponse<String> response = Unirest.get("https://spoonacular-recipe-food-nutrition-v1.p.rapidapi.com/recipes/search?number=25&offset=0&type=main%20course&query="+title)
                .header("x-rapidapi-host", "spoonacular-recipe-food-nutrition-v1.p.rapidapi.com")
                .header("x-rapidapi-key", "95e63d77d8mshcd6163a94d2be7bp15c756jsn981c624f96fc")
                .asString();

        System.out.println( response.getBody());

        ArrayList<Recipe> recipes = this.titleResultsToRecipe(response.getBody());
        return recipes;
    }

    private ArrayList<Recipe> titleResultsToRecipe(String json){

        ArrayList<Recipe> recipes = new ArrayList();
        JSONObject obj = new JSONObject(json);
        JSONArray scores = obj.getJSONArray("results");
        for (int i = 0; i < scores.length(); i++) {
            JSONObject element = scores.getJSONObject(i);
            Recipe object = new Recipe();
            object.setId(element.getInt("id"));
            object.setServings(element.getInt("servings"));
            object.setTitle(element.getString("title"));
            object.setImage(baseUri+element.getString("image"));
            object.setReadyInMinutes(element.getInt("readyInMinutes"));
            recipes.add(object);
        }
        System.out.println(recipes.get(0).toString());
        System.out.println(recipes.size());
        return recipes;
    }

    // Þarf að hafa seperate aðferðir til að breyta í Recipe hlut vegna mismunandi
    // svara frá Spoonacular API
    private ArrayList<Recipe> ingrResultsToRecipe(String json) {
        ArrayList<Recipe> recipes = new ArrayList();
        JSONObject obj = new JSONObject(json);
        JSONArray scores = obj.getJSONArray("results");
        for (int i = 0; i < scores.length(); i++) {
            JSONObject element = scores.getJSONObject(i);
            Recipe object = new Recipe();
            object.setId(element.getInt("id"));
            object.setTitle(element.getString("title"));
            object.setImage(element.getString("image"));
            recipes.add(object);
        }
        System.out.println(recipes.get(0).toString());
        return recipes;
    }

}

