package is.hi.hbv501g.freyr.Freyr.Utilities;

import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class addListsToModel {
    public static void ingredientsToModel(Model model){
        List<String> vegtableListTemp = Arrays.asList( "tomato", "lettuce", "cucumber", "bell pepper", "mushrooms", "artichoke", "eggplant");
        ArrayList<String> vegtableList = new ArrayList<String>();
        vegtableList.addAll(vegtableListTemp);
        model.addAttribute("vegtables", vegtableList);

        List<String> dairyListTemp = Arrays.asList( "milk", "cream", "butter");
        ArrayList<String> dairyList = new ArrayList<String>();
        dairyList.addAll(dairyListTemp);
        model.addAttribute("dairy", dairyList);

        List<String> fruitListTemp = Arrays.asList( "pinapple", "apples", "oranges");
        ArrayList<String> fruitList = new ArrayList<String>();
        fruitList.addAll(fruitListTemp);
        model.addAttribute("fruits", fruitList);
    }

    public static void mealKindsToModel(Model model){
        List<String> mealKindsTemp = Arrays.asList( "main course", "side dish", "dessert", "appetizer", "salad", "bread", "breakfast", "soup", "beverage", "sauce", "drink");
        ArrayList<String> mealKinds = new ArrayList<String>();
        mealKinds.addAll(mealKindsTemp);
        model.addAttribute("mealKinds", mealKinds);
    }
}
