package menu;

import warehouse.Alcohol;
import warehouse.BottleDrinks;
import warehouse.Product;
import warehouse.Quantity;

import java.math.BigDecimal;
import java.util.*;

public class Recipe {
    private List<Pizza> pizzaList;
    private List<Salad> saladList;
    private List<Alcohol> alcoholList;
    private List<BottleDrinks> bottleDrinksList;

    private static Recipe recipe = null;

    public Recipe() {
        pizzaList = new ArrayList<>();
        saladList = new ArrayList<>();
        alcoholList = new ArrayList<>();
        Map<Product.Type, Quantity> pizza;

        pizza = new LinkedHashMap<>();
        pizza.put(Product.Type.BATTER, new Quantity(BigDecimal.valueOf(200), Quantity.Unit.G));
        pizza.put(Product.Type.HAM, new Quantity(BigDecimal.valueOf(70), Quantity.Unit.G));
        pizza.put(Product.Type.TOMATO_SAUCE, new Quantity(BigDecimal.valueOf(40), Quantity.Unit.G));
        pizza.put(Product.Type.MOZARELLA, new Quantity(BigDecimal.valueOf(40), Quantity.Unit.G));
        pizzaList.add(new Pizza(Pizza.PizzaType.CALCONE, Pizza.PizzaSize.SMALL, pizza));

        pizza = new LinkedHashMap<>();
        pizza.put(Product.Type.BATTER, new Quantity(BigDecimal.valueOf(250), Quantity.Unit.G));
        pizza.put(Product.Type.HAM, new Quantity(BigDecimal.valueOf(100), Quantity.Unit.G));
        pizza.put(Product.Type.TOMATO_SAUCE, new Quantity(BigDecimal.valueOf(40), Quantity.Unit.G));
        pizza.put(Product.Type.MOZARELLA, new Quantity(BigDecimal.valueOf(60), Quantity.Unit.G));
        pizzaList.add(new Pizza(Pizza.PizzaType.CALCONE, Pizza.PizzaSize.LARGE, pizza));

        pizza = new LinkedHashMap<>();
        pizza.put(Product.Type.BATTER, new Quantity(BigDecimal.valueOf(200), Quantity.Unit.G));
        pizza.put(Product.Type.BBQ_SAUCE, new Quantity(BigDecimal.valueOf(40), Quantity.Unit.G));
        pizza.put(Product.Type.PEPERONI, new Quantity(BigDecimal.valueOf(40), Quantity.Unit.G));
        pizza.put(Product.Type.CHEDDAR, new Quantity(BigDecimal.valueOf(50), Quantity.Unit.G));
        pizza.put(Product.Type.ONION, new Quantity(BigDecimal.valueOf(20), Quantity.Unit.G));
        pizzaList.add(new Pizza(Pizza.PizzaType.CLASSIC, Pizza.PizzaSize.SMALL, pizza));

        pizza = new LinkedHashMap<>();
        pizza.put(Product.Type.BATTER, new Quantity(BigDecimal.valueOf(250), Quantity.Unit.G));
        pizza.put(Product.Type.BBQ_SAUCE, new Quantity(BigDecimal.valueOf(40), Quantity.Unit.G));
        pizza.put(Product.Type.PEPERONI, new Quantity(BigDecimal.valueOf(40), Quantity.Unit.G));
        pizza.put(Product.Type.CHEDDAR, new Quantity(BigDecimal.valueOf(40), Quantity.Unit.G));
        pizza.put(Product.Type.ONION, new Quantity(BigDecimal.valueOf(20), Quantity.Unit.G));
        pizzaList.add(new Pizza(Pizza.PizzaType.CLASSIC, Pizza.PizzaSize.LARGE, pizza));

        pizza = new LinkedHashMap<>();
        pizza.put(Product.Type.BATTER, new Quantity(BigDecimal.valueOf(250), Quantity.Unit.G));
        pizza.put(Product.Type.MOZARELLA, new Quantity(BigDecimal.valueOf(50), Quantity.Unit.G));
        pizza.put(Product.Type.TOMATO_SAUCE, new Quantity(BigDecimal.valueOf(45), Quantity.Unit.G));
        pizza.put(Product.Type.PARSLEY, new Quantity(BigDecimal.valueOf(5), Quantity.Unit.G));
        pizzaList.add(new Pizza(Pizza.PizzaType.MARGARITA, Pizza.PizzaSize.SMALL, pizza));

        pizza = new LinkedHashMap<>();
        pizza.put(Product.Type.BATTER, new Quantity(BigDecimal.valueOf(280), Quantity.Unit.G));
        pizza.put(Product.Type.MOZARELLA, new Quantity(BigDecimal.valueOf(85), Quantity.Unit.G));
        pizza.put(Product.Type.TOMATO_SAUCE, new Quantity(BigDecimal.valueOf(80), Quantity.Unit.G));
        pizza.put(Product.Type.PARSLEY, new Quantity(BigDecimal.valueOf(5), Quantity.Unit.G));
        pizzaList.add(new Pizza(Pizza.PizzaType.MARGARITA, Pizza.PizzaSize.LARGE, pizza));

        pizza = new LinkedHashMap<>();
        pizza.put(Product.Type.BATTER, new Quantity(BigDecimal.valueOf(200), Quantity.Unit.G));
        pizza.put(Product.Type.MOZARELLA, new Quantity(BigDecimal.valueOf(40), Quantity.Unit.G));
        pizza.put(Product.Type.TOMATO_SAUCE, new Quantity(BigDecimal.valueOf(40), Quantity.Unit.G));
        pizza.put(Product.Type.TOMATO, new Quantity(BigDecimal.valueOf(40), Quantity.Unit.G));
        pizza.put(Product.Type.ARUGULA, new Quantity(BigDecimal.valueOf(10), Quantity.Unit.G));
        pizzaList.add(new Pizza(Pizza.PizzaType.LEO_ITALIANO, Pizza.PizzaSize.SMALL, pizza));

        pizza = new LinkedHashMap<>();
        pizza.put(Product.Type.BATTER, new Quantity(BigDecimal.valueOf(250), Quantity.Unit.G));
        pizza.put(Product.Type.MOZARELLA, new Quantity(BigDecimal.valueOf(60), Quantity.Unit.G));
        pizza.put(Product.Type.TOMATO_SAUCE, new Quantity(BigDecimal.valueOf(50), Quantity.Unit.G));
        pizza.put(Product.Type.TOMATO, new Quantity(BigDecimal.valueOf(80), Quantity.Unit.G));
        pizza.put(Product.Type.ARUGULA, new Quantity(BigDecimal.valueOf(10), Quantity.Unit.G));
        pizzaList.add(new Pizza(Pizza.PizzaType.LEO_ITALIANO, Pizza.PizzaSize.LARGE, pizza));

        pizza = new LinkedHashMap<>();
        pizza.put(Product.Type.BATTER, new Quantity(BigDecimal.valueOf(200), Quantity.Unit.G));
        pizza.put(Product.Type.MOZARELLA, new Quantity(BigDecimal.valueOf(20), Quantity.Unit.G));
        pizza.put(Product.Type.TOMATO_SAUCE, new Quantity(BigDecimal.valueOf(20), Quantity.Unit.G));
        pizza.put(Product.Type.BBQ_SAUCE, new Quantity(BigDecimal.valueOf(20), Quantity.Unit.G));
        pizza.put(Product.Type.CHICKEN, new Quantity(BigDecimal.valueOf(75), Quantity.Unit.G));
        pizza.put(Product.Type.ONION, new Quantity(BigDecimal.valueOf(10), Quantity.Unit.G));
        pizza.put(Product.Type.PARSLEY, new Quantity(BigDecimal.valueOf(5), Quantity.Unit.G));
        pizzaList.add(new Pizza(Pizza.PizzaType.TEXAS, Pizza.PizzaSize.SMALL, pizza));

        pizza = new LinkedHashMap<>();
        pizza.put(Product.Type.BATTER, new Quantity(BigDecimal.valueOf(250), Quantity.Unit.G));
        pizza.put(Product.Type.MOZARELLA, new Quantity(BigDecimal.valueOf(30), Quantity.Unit.G));
        pizza.put(Product.Type.TOMATO_SAUCE, new Quantity(BigDecimal.valueOf(20), Quantity.Unit.G));
        pizza.put(Product.Type.BBQ_SAUCE, new Quantity(BigDecimal.valueOf(20), Quantity.Unit.G));
        pizza.put(Product.Type.CHICKEN, new Quantity(BigDecimal.valueOf(115), Quantity.Unit.G));
        pizza.put(Product.Type.ONION, new Quantity(BigDecimal.valueOf(10), Quantity.Unit.G));
        pizza.put(Product.Type.PARSLEY, new Quantity(BigDecimal.valueOf(5), Quantity.Unit.G));
        pizzaList.add(new Pizza(Pizza.PizzaType.TEXAS, Pizza.PizzaSize.LARGE, pizza));

        pizza = new LinkedHashMap<>();
        pizza.put(Product.Type.BATTER, new Quantity(BigDecimal.valueOf(200), Quantity.Unit.G));
        pizza.put(Product.Type.MOZARELLA, new Quantity(BigDecimal.valueOf(20), Quantity.Unit.G));
        pizza.put(Product.Type.CHEESE, new Quantity(BigDecimal.valueOf(20), Quantity.Unit.G));
        pizza.put(Product.Type.HAM, new Quantity(BigDecimal.valueOf(20), Quantity.Unit.G));
        pizza.put(Product.Type.CHICKEN, new Quantity(BigDecimal.valueOf(80), Quantity.Unit.G));
        pizza.put(Product.Type.ONION, new Quantity(BigDecimal.valueOf(10), Quantity.Unit.G));
        pizzaList.add(new Pizza(Pizza.PizzaType.KAPRI, Pizza.PizzaSize.SMALL, pizza));

        pizza = new LinkedHashMap<>();
        pizza.put(Product.Type.BATTER, new Quantity(BigDecimal.valueOf(250), Quantity.Unit.G));
        pizza.put(Product.Type.MOZARELLA, new Quantity(BigDecimal.valueOf(30), Quantity.Unit.G));
        pizza.put(Product.Type.CHEESE, new Quantity(BigDecimal.valueOf(30), Quantity.Unit.G));
        pizza.put(Product.Type.HAM, new Quantity(BigDecimal.valueOf(20), Quantity.Unit.G));
        pizza.put(Product.Type.CHICKEN, new Quantity(BigDecimal.valueOf(80), Quantity.Unit.G));
        pizza.put(Product.Type.ONION, new Quantity(BigDecimal.valueOf(30), Quantity.Unit.G));
        pizzaList.add(new Pizza(Pizza.PizzaType.KAPRI, Pizza.PizzaSize.LARGE, pizza));

        Map<Product.Type, Quantity> salad;
        salad = new HashMap<>();
        salad.put(Product.Type.ONION, new Quantity(BigDecimal.valueOf(50), Quantity.Unit.G));
        salad.put(Product.Type.TOMATO, new Quantity(BigDecimal.valueOf(150), Quantity.Unit.G));
        salad.put(Product.Type.CUCUMBER, new Quantity(BigDecimal.valueOf(100), Quantity.Unit.G));
        salad.put(Product.Type.CHEESE, new Quantity(BigDecimal.valueOf(50), Quantity.Unit.G));
        saladList.add(new Salad(Salad.SaladType.SHOPSKA, Salad.SaladSize.NORMAL, salad));

        salad = new HashMap<>();
        salad.put(Product.Type.TOMATO, new Quantity(BigDecimal.valueOf(220), Quantity.Unit.G));
        salad.put(Product.Type.MOZARELLA, new Quantity(BigDecimal.valueOf(110), Quantity.Unit.G));
        salad.put(Product.Type.PARSLEY, new Quantity(BigDecimal.valueOf(10), Quantity.Unit.G));
        saladList.add(new Salad(Salad.SaladType.TOMATOS_AND_MOZZARELA, Salad.SaladSize.NORMAL, salad));

        salad = new HashMap<>();
        salad.put(Product.Type.LETTUCE, new Quantity(BigDecimal.valueOf(60), Quantity.Unit.G));
        salad.put(Product.Type.TOMATO, new Quantity(BigDecimal.valueOf(100), Quantity.Unit.G));
        salad.put(Product.Type.CHICKEN, new Quantity(BigDecimal.valueOf(90), Quantity.Unit.G));
        saladList.add(new Salad(Salad.SaladType.CEZAR, Salad.SaladSize.NORMAL, salad));

        salad = new HashMap<>();
        salad.put(Product.Type.ONION, new Quantity(BigDecimal.valueOf(15), Quantity.Unit.G));
        salad.put(Product.Type.TOMATO, new Quantity(BigDecimal.valueOf(120), Quantity.Unit.G));
        salad.put(Product.Type.CUCUMBER, new Quantity(BigDecimal.valueOf(100), Quantity.Unit.G));
        salad.put(Product.Type.CHEESE, new Quantity(BigDecimal.valueOf(45), Quantity.Unit.G));
        salad.put(Product.Type.HAM, new Quantity(BigDecimal.valueOf(60), Quantity.Unit.G));
        salad.put(Product.Type.PARSLEY, new Quantity(BigDecimal.valueOf(10), Quantity.Unit.G));
        saladList.add(new Salad(Salad.SaladType.OVCHARSKA, Salad.SaladSize.NORMAL, salad));

        Map<Alcohol.Type, Quantity> alcohol;

        alcohol = new HashMap<>();
        alcohol.put(Alcohol.Type.VODKA, new Quantity(BigDecimal.valueOf(50), Quantity.Unit.ML));
        alcoholList.add(new Alcohol(Alcohol.Type.VODKA, Alcohol.AlcoholSize.SMALL, alcohol));

        alcohol = new HashMap<>();
        alcohol.put(Alcohol.Type.VODKA, new Quantity(BigDecimal.valueOf(100), Quantity.Unit.ML));
        alcoholList.add(new Alcohol(Alcohol.Type.VODKA, Alcohol.AlcoholSize.Large, alcohol));

        alcohol = new HashMap<>();
        alcohol.put(Alcohol.Type.WHISKY, new Quantity(BigDecimal.valueOf(50), Quantity.Unit.ML));
        alcoholList.add(new Alcohol(Alcohol.Type.WHISKY, Alcohol.AlcoholSize.SMALL, alcohol));

        alcohol = new HashMap<>();
        alcohol.put(Alcohol.Type.WHISKY, new Quantity(BigDecimal.valueOf(100), Quantity.Unit.ML));
        alcoholList.add(new Alcohol(Alcohol.Type.WHISKY, Alcohol.AlcoholSize.Large, alcohol));

        alcohol = new HashMap<>();
        alcohol.put(Alcohol.Type.RUM, new Quantity(BigDecimal.valueOf(50), Quantity.Unit.ML));
        alcoholList.add(new Alcohol(Alcohol.Type.RUM, Alcohol.AlcoholSize.SMALL, alcohol));

        alcohol = new HashMap<>();
        alcohol.put(Alcohol.Type.RUM, new Quantity(BigDecimal.valueOf(100), Quantity.Unit.ML));
        alcoholList.add(new Alcohol(Alcohol.Type.RUM, Alcohol.AlcoholSize.Large, alcohol));

        alcohol = new HashMap<>();
        alcohol.put(Alcohol.Type.RED_WINE, new Quantity(BigDecimal.valueOf(200), Quantity.Unit.ML));
        alcoholList.add(new Alcohol(Alcohol.Type.RED_WINE, Alcohol.AlcoholSize.SMALL, alcohol));

        alcohol = new HashMap<>();
        alcohol.put(Alcohol.Type.RED_WINE, new Quantity(BigDecimal.valueOf(700), Quantity.Unit.ML));
        alcoholList.add(new Alcohol(Alcohol.Type.RED_WINE, Alcohol.AlcoholSize.Large, alcohol));

        alcohol = new HashMap<>();
        alcohol.put(Alcohol.Type.WHITE_WINE, new Quantity(BigDecimal.valueOf(200), Quantity.Unit.ML));
        alcoholList.add(new Alcohol(Alcohol.Type.WHITE_WINE, Alcohol.AlcoholSize.SMALL, alcohol));

        alcohol = new HashMap<>();
        alcohol.put(Alcohol.Type.WHITE_WINE, new Quantity(BigDecimal.valueOf(700), Quantity.Unit.ML));
        alcoholList.add(new Alcohol(Alcohol.Type.WHITE_WINE, Alcohol.AlcoholSize.Large, alcohol));

        alcohol = new HashMap<>();
        alcohol.put(Alcohol.Type.ROSE, new Quantity(BigDecimal.valueOf(200), Quantity.Unit.ML));
        alcoholList.add(new Alcohol(Alcohol.Type.ROSE, Alcohol.AlcoholSize.SMALL, alcohol));

        alcohol = new HashMap<>();
        alcohol.put(Alcohol.Type.ROSE, new Quantity(BigDecimal.valueOf(700), Quantity.Unit.ML));
        alcoholList.add(new Alcohol(Alcohol.Type.ROSE, Alcohol.AlcoholSize.Large, alcohol));

        alcohol = new HashMap<>();
        alcohol.put(Alcohol.Type.SCHNAPPS, new Quantity(BigDecimal.valueOf(50), Quantity.Unit.ML));
        alcoholList.add(new Alcohol(Alcohol.Type.SCHNAPPS, Alcohol.AlcoholSize.SMALL, alcohol));

        alcohol = new HashMap<>();
        alcohol.put(Alcohol.Type.SCHNAPPS, new Quantity(BigDecimal.valueOf(100), Quantity.Unit.ML));
        alcoholList.add(new Alcohol(Alcohol.Type.SCHNAPPS, Alcohol.AlcoholSize.Large, alcohol));

        bottleDrinksList = new ArrayList<>();
        Map<BottleDrinks.Type, Quantity> bottleDrinks;

        bottleDrinks = new HashMap<>();
        bottleDrinks.put(BottleDrinks.Type.STELLA_ARTOIS, new Quantity(BigDecimal.valueOf(1), Quantity.Unit.Count));
        bottleDrinksList.add(new BottleDrinks(BottleDrinks.Type.STELLA_ARTOIS, bottleDrinks));

        bottleDrinks = new HashMap<>();
        bottleDrinks.put(BottleDrinks.Type.FANTA, new Quantity(BigDecimal.valueOf(1), Quantity.Unit.Count));
        bottleDrinksList.add(new BottleDrinks(BottleDrinks.Type.FANTA, bottleDrinks));

        bottleDrinks = new HashMap<>();
        bottleDrinks.put(BottleDrinks.Type.COCA_COLA, new Quantity(BigDecimal.valueOf(1), Quantity.Unit.Count));
        bottleDrinksList.add(new BottleDrinks(BottleDrinks.Type.COCA_COLA, bottleDrinks));

        bottleDrinks = new HashMap<>();
        bottleDrinks.put(BottleDrinks.Type.PIRINSKO, new Quantity(BigDecimal.valueOf(1), Quantity.Unit.Count));
        bottleDrinksList.add(new BottleDrinks(BottleDrinks.Type.PIRINSKO, bottleDrinks));

        bottleDrinks = new HashMap<>();
        bottleDrinks.put(BottleDrinks.Type.HEINIKEN, new Quantity(BigDecimal.valueOf(1), Quantity.Unit.Count));
        bottleDrinksList.add(new BottleDrinks(BottleDrinks.Type.HEINIKEN, bottleDrinks));

        bottleDrinks = new HashMap<>();
        bottleDrinks.put(BottleDrinks.Type.ZAGORKA_SPECIAL, new Quantity(BigDecimal.valueOf(1), Quantity.Unit.Count));
        bottleDrinksList.add(new BottleDrinks(BottleDrinks.Type.ZAGORKA_SPECIAL, bottleDrinks));

        bottleDrinks = new HashMap<>();
        bottleDrinks.put(BottleDrinks.Type.ZAGORKA_RETRO, new Quantity(BigDecimal.valueOf(1), Quantity.Unit.Count));
        bottleDrinksList.add(new BottleDrinks(BottleDrinks.Type.ZAGORKA_RETRO, bottleDrinks));

        bottleDrinks = new HashMap<>();
        bottleDrinks.put(BottleDrinks.Type.BIRICHKA, new Quantity(BigDecimal.valueOf(1), Quantity.Unit.Count));
        bottleDrinksList.add(new BottleDrinks(BottleDrinks.Type.BIRICHKA, bottleDrinks));

        bottleDrinks = new HashMap<>();
        bottleDrinks.put(BottleDrinks.Type.QK_PUSTINQK, new Quantity(BigDecimal.valueOf(1), Quantity.Unit.Count));
        bottleDrinksList.add(new BottleDrinks(BottleDrinks.Type.QK_PUSTINQK, bottleDrinks));

        bottleDrinks = new HashMap<>();
        bottleDrinks.put(BottleDrinks.Type.BLAG_PUSTINQK, new Quantity(BigDecimal.valueOf(1), Quantity.Unit.Count));
        bottleDrinksList.add(new BottleDrinks(BottleDrinks.Type.BLAG_PUSTINQK, bottleDrinks));

        bottleDrinks = new HashMap<>();
        bottleDrinks.put(BottleDrinks.Type.BASH_PUSTINQK, new Quantity(BigDecimal.valueOf(1), Quantity.Unit.Count));
        bottleDrinksList.add(new BottleDrinks(BottleDrinks.Type.BASH_PUSTINQK, bottleDrinks));

        bottleDrinks = new HashMap<>();
        bottleDrinks.put(BottleDrinks.Type.SPRITE, new Quantity(BigDecimal.valueOf(1), Quantity.Unit.Count));
        bottleDrinksList.add(new BottleDrinks(BottleDrinks.Type.SPRITE, bottleDrinks));

        bottleDrinks = new HashMap<>();
        bottleDrinks.put(BottleDrinks.Type.SOMERSBY, new Quantity(BigDecimal.valueOf(1), Quantity.Unit.Count));
        bottleDrinksList.add(new BottleDrinks(BottleDrinks.Type.SOMERSBY, bottleDrinks));

        bottleDrinks = new HashMap<>();
        bottleDrinks.put(BottleDrinks.Type.WATTER, new Quantity(BigDecimal.valueOf(1), Quantity.Unit.Count));
        bottleDrinksList.add(new BottleDrinks(BottleDrinks.Type.WATTER, bottleDrinks));

        bottleDrinks = new HashMap<>();
        bottleDrinks.put(BottleDrinks.Type.CAPPY_ORANGE, new Quantity(BigDecimal.valueOf(1), Quantity.Unit.Count));
        bottleDrinksList.add(new BottleDrinks(BottleDrinks.Type.CAPPY_ORANGE, bottleDrinks));

        bottleDrinks = new HashMap<>();
        bottleDrinks.put(BottleDrinks.Type.CAPPY_ORANGE, new Quantity(BigDecimal.valueOf(1), Quantity.Unit.Count));
        bottleDrinksList.add(new BottleDrinks(BottleDrinks.Type.CAPPY_ORANGE, bottleDrinks));

    }

    public void setPizzaList(List<Pizza> pizzaList) {
        this.pizzaList = pizzaList;
    }

    public void setSaladList(List<Salad> saladList) {
        this.saladList = saladList;
    }

    public List<Pizza> getPizzaList() {
        return pizzaList;
    }

    public List<Salad> getSaladList() {
        return saladList;
    }

    public List<Alcohol> getAlcoholList() {
        return alcoholList;
    }

    public List<BottleDrinks> getBottleDrinksList() {
        return bottleDrinksList;
    }

    public Pizza returnRandom() {
        int number = new Random().nextInt(pizzaList.size());
        return pizzaList.get(number);
    }

    public static Recipe getInstance() {
        if (recipe == null) {
            recipe = new Recipe();
        }
        return recipe;
    }


    @Override
    public String toString() {
        return "Recipe{" +
                "pizzaList=" + pizzaList +
                ", saladList=" + saladList +
                ", alcoholList=" + alcoholList +
                ", bottleDrinksList=" + bottleDrinksList +
                '}';
    }
}


