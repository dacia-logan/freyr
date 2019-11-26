package is.hi.hbv501g.freyr.Freyr.Utilities;

import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class addListsToModel {
    public static void ingredientsToModel(Model model){
        List<String> vegtableListTemp = Arrays.asList("artichoke", "artichoke heart", "arugula", "asparagus", "avocado", "bamboo shoot", "basil", "bean sprouts", "beet", "bell pepper", "black beans", "bok choy", "broccoli", "broccoli rabe", "brussels sprout", "burdock", "butternut", "butternut squash", "cabbage", "canned tomato", "cannellini beans", "caper", "capsicum", "carrot", "cauliflower", "celery", "celery root", "chard", "chayote", "chia seeds", "chickpea", "chili beans", "chili pepper", "chinese broccoli", "cilantro", "collard", "corn", "cress", "cucumber", "daikon", "dill", "dulse", "edamame", "eggplant", "endive", "fava beans", "fennel", "french beans", "frozen vegetables", "garlic", "ginger", "great northern beans", "green beans", "green beans", "hearts of palm", "horseradish", "hummus", "jerusalem artichoke", "jicama", "kale", "kidney beans", "kohlrabi", "leek", "lentil", "lima beans", "micro greens", "mint", "mixed vegetable", "mushroom", "mustard greens", "navy beans", "okra", "olive", "onion", "parsley", "parsnip", "peas", "pickle", "pimiento", "pinto beans", "porcini", "portobello mushroom", "potato", "pumpkin", "radicchio", "radish", "red beans", "red onion", "refried beans", "rocket", "rosemary", "rutabaga", "salad greens", "sauerkraut", "scallion", "seaweed", "shallot", "snap peas", "snow peas", "soybeans", "spaghetti squash", "spinach", "split peas", "squash", "sun dried tomato", "sweet pepper", "sweet potato", "tomatillo", "tomato", "turnip", "water chestnut", "watercress", "yam", "zucchini");
        ArrayList<String> vegtableList = new ArrayList<String>();
        vegtableList.addAll(vegtableListTemp);
        model.addAttribute("vegetables", vegtableList);

        List<String> dairyListTemp = Arrays.asList("almond milk", "american cheese", "asiago", "blue cheese", "bocconcini cheese", "brick cheese", "brie", "butter", "buttermilk", "camembert cheese", "cheddar", "cheese soup", "cheshire cheese", "coconut milk", "colby cheese", "condensed milk", "cottage cheese", "cream", "cream cheese", "creme de cassis", "creme fraiche", "custard", "double gloucester cheese", "edam cheese", "egg", "emmenthaler cheese", "evaporated milk", "farmer cheese", "feta", "fontina", "frosting", "garlic herb cheese", "ghee", "goat cheese", "goat milk", "gouda", "gruyere", "half and half", "halloumi", "hard cheese", "havarti cheese", "hemp milk", "ice cream", "italian cheese", "jarlsberg cheese", "lancashire cheese", "longhorn cheese", "manchego", "margarine", "mascarpone", "milk", "monterey jack cheese", "mozzarella", "muenster", "neufchatel", "non dairy creamer", "paneer", "parmesan", "pecorino cheese", "pepper jack", "pepperjack cheese", "pizza cheese", "powdered milk", "provolone", "queso fresco cheese", "raclette cheese", "red leicester cheese", "rice milk", "ricotta", "romano", "soft cheese", "sour cream", "soy milk", "stilton cheese", "swiss cheese", "velveeta", "wensleydale cheese", "whipped cream", "yogurt");
        ArrayList<String> dairyList = new ArrayList<String>();
        dairyList.addAll(dairyListTemp);
        model.addAttribute("dairyAndAlternatives", dairyList);

        List<String> fruitListTemp = Arrays.asList("apple", "apple butter", "apricot", "banana", "berries", "blackberry", "blueberry", "boysenberry", "cantaloupe", "cherry", "clementine", "coconut", "crabapples", "craisins", "cranberry", "currant", "date", "fig", "grape", "grapefruit", "guava", "honeydew", "kiwi", "kumquat", "lemon", "lime", "lingonberry", "lychee", "mandarin", "mango", "nectarine", "orange", "papaya", "passion fruit", "peach", "pear", "persimmons", "pineapple", "plantain", "plum", "pomegranate", "prunes", "quince", "raisin", "raspberry", "rhubarb", "star fruit", "strawberry", "sultanas", "tangelos", "tangerine", "watermelon");
        ArrayList<String> fruitList = new ArrayList<String>();
        fruitList.addAll(fruitListTemp);
        model.addAttribute("fruits", fruitList);

        List<String> meatListTemp = Arrays.asList("alligator", "bacon", "beef liver", "beef ribs", "beef roast", "beef shank", "beef sirloin", "beef steak", "beef suet", "bologna", "bratwurst", "canadian bacon", "chicken breast", "chicken giblets", "chicken leg", "chicken roast", "chicken tenders", "chicken thighs", "chicken wings", "chorizo", "cooked chicken", "corned beef", "cornish hen", "deer", "duck", "duck liver", "elk", "foie gras", "goose", "goose liver", "ground beef", "ground chicken", "ground lamb", "ground pork", "ground turkey", "ground veal", "grouse", "ham", "hot dog", "lamb", "lamb chops", "lamb liver", "lamb loin", "lamb shank", "lamb shoulder", "leg of lamb", "liver sausage", "marrow bones", "moose", "ostrich", "oxtail", "pancetta", "pastrami", "pepperoni", "pheasant", "pigeon", "polish sausage", "pork", "pork belly", "pork chops", "pork liver", "pork loin", "pork ribs", "pork roast", "pork shoulder", "prosciutto", "quail", "rabbit", "salami", "sausage", "sliced turkey", "snail", "soppressata", "spam", "sweetbread", "turkey", "turkey liver", "veal", "veal chops", "veal cutlet", "veal shank", "venison", "whole chicken", "wild boar" );
        ArrayList<String> meatList = new ArrayList<String>();
        meatList.addAll(meatListTemp);
        model.addAttribute("meats", meatList);

        List<String> seafoodListTemp = Arrays.asList("amberjack", " calamari", "anchovy", "arctic char", "barramundi", "bluefish", "canned salmon", "canned tuna", "carp", "catfish", "caviar", "clam", "cockle", "cod", "conch", "crab", "crawfish", "cuttlefish", "eel", "fish fillets", "flounder", "grouper", "haddock", "halibut", "herring", "john dory", "lemon sole", "lobster", "mackerel", "mahi mahi", "marlin", "monkfish", "mussel", "octopus", "oyster", "perch", "pike", "pollock", "pompano", "prawns", "red snapper", "rockfish", "salmon", "sardines", "scallop", "sea bass", "sea urchin", "shrimp", "smoked salmon", "sole", "squid", "sturgeon", "swordfish", "tilapia", "trout", "tuna steak", "whitefish");
        ArrayList<String> seafoodAndFishList = new ArrayList<String>();
        seafoodAndFishList.addAll(seafoodListTemp);
        model.addAttribute("seafoodAndFish", seafoodAndFishList);

        List<String> nutsListTemp = Arrays.asList("almond", "almond meal", "almond paste", "cashew", "chestnut", "flax", "hazelnut", "macadamia", "macaroon", "peanut", "peanut butter", "pecan", "pine nut", "pistachio", "praline", "walnut" );
        ArrayList<String> nutsList = new ArrayList<String>();
        nutsList.addAll(nutsListTemp);
        model.addAttribute("nuts", nutsList);

        List<String> grainsAndBakingListTemp = Arrays.asList("angel food", "angel hair", "bagel", "baguette", "baking powder", "baking soda", "barley", "bicarbonate of soda", "biscuits", "bisquick", "bran", "bread", "bread crumbs", "bread dough", "bread flour", "breadsticks", "brown rice", "buckwheat", "cake mix", "cereal", "challah", "chips", "ciabatta", "coconut flake", "coconut flour", "corn tortillas", "cornbread", "cornflour", "cornmeal", "cornstarch", "couscous", "cracker", "cream of wheat", "crescent roll dough", "croissants", "croutons", "english muffin", "filo dough", "flour", "flour tortillas", "gnocchi", "gram flour", "hot dog bun", "lasagne", "macaroni cheese mix", "malt extract", "matzo meal", "muffin mix", "multigrain bread", "noodle", "pancake mix", "pasta", "pie crust", "pierogi", "pita", "pizza dough", "polenta", "popcorn", "potato flakes", "potato starch", "pretzel", "puff pastry", "quinoa", "ramen", "ravioli", "rice", "rice flour", "risotto", "rolled oats", "rye", "saltines", "self rising flour", "semolina", "shortcrust pastry", "sorghum flour", "sourdough starter", "spelt", "sponge cake", "starch", "stuffing mix", "tapioca flour", "tapioca starch", "vermicelli", "wafer", "wheat", "wheat germ", "whole wheat flour", "yeast", "yeast flake");
        ArrayList<String> grainsAndBakingList = new ArrayList<String>();
        grainsAndBakingList.addAll(grainsAndBakingListTemp);
        model.addAttribute("grainsAndBaking", grainsAndBakingList );

        List<String> oilListTemp = Arrays.asList("almond oil", "avocado oil", "canola oil", "coconut oil", "cooking spray", "corn oil", "grape seed oil", "hazelnut oil", "lard", "mustard oil", "olive oil", "palm oil", "peanut oil", "pistachio oil", "safflower oil", "sesame oil", "shortening", "soya oil", "soybean oil", "sunflower oil", "vegetable oil", "walnut oil" );
        ArrayList<String> oilList = new ArrayList<String>();
        oilList.addAll(oilListTemp);
        model.addAttribute("oils", oilList );

        List<String> sweetListTemp = Arrays.asList("agave nectar", "amaretti cookies", "apple jelly", "apple sauce", "apricot jam", "artificial sweetener", "biscotti biscuit", "bittersweet chocolate", "black pudding", "blackberry preserves", "blueberry jam", "brown sugar", "brownie mix", "butterscotch", "candy", "caramel", "cherry jam", "chilli jam", "chocolate", "chocolate bar", "chocolate chips", "chocolate cookies", "chocolate morsels", "chocolate powder", "chocolate pudding", "chocolate syrup", "chocolate wafer", "cinnamon roll", "confectioners sugar", "cookie crumb", "cookie dough", "cookies", "corn chips", "corn syrup", "currant jelly", "dark chocolate", "doritos", "doughnut", "fig jam", "fudge", "graham cracker", "grape jelly", "gummy worms", "honey", "jalapeno jelly", "jam", "jello", "lady fingers", "lemon jelly", "maple syrup", "marshmallow", "mint jelly", "molasses", "nutella", "orange jelly", "oreo", "peach preserves", "plum jam", "potato chips", "pudding mix", "quince jelly", "raspberry jam", "red pepper jelly", "strawberry jam", "sugar", "white chocolate");
        ArrayList<String> sweetList = new ArrayList<String>();
        sweetList.addAll(sweetListTemp);
        model.addAttribute("sweets", sweetList);

    }

    public static void mealKindsToModel(Model model){
        List<String> mealKindsTemp = Arrays.asList( "main course", "side dish", "dessert", "appetizer", "salad", "bread", "breakfast", "soup", "beverage", "sauce", "drink");
        ArrayList<String> mealKinds = new ArrayList<String>();
        mealKinds.addAll(mealKindsTemp);
        model.addAttribute("mealKinds", mealKinds);
    }
}
