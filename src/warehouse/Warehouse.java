package warehouse;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    Map<Product.Type, Product> foodQuantities;
    Map<Alcohol.Type, Alcohol> alcoholQuantities;
    Map<BottleDrinks.Type, BottleDrinks> bottleDrinksQuantities;
    private static Warehouse warehouse = null;

    public Warehouse() {

        this.foodQuantities = new HashMap<>();
        foodQuantities.put(Product.Type.BATTER, new Product(Product.Type.BATTER, BigDecimal.valueOf(10)));
        foodQuantities.put(Product.Type.TOMATO_SAUCE, new Product(Product.Type.TOMATO_SAUCE, BigDecimal.valueOf(5)));
        foodQuantities.put(Product.Type.HAM, new Product(Product.Type.HAM, BigDecimal.valueOf(10)));
        foodQuantities.put(Product.Type.MOZARELLA, new Product(Product.Type.MOZARELLA, BigDecimal.valueOf(5)));
        foodQuantities.put(Product.Type.MUSHROOM, new Product(Product.Type.MUSHROOM, BigDecimal.valueOf(5)));
        foodQuantities.put(Product.Type.TOMATO, new Product(Product.Type.TOMATO, BigDecimal.valueOf(5)));
        foodQuantities.put(Product.Type.BBQ_SAUCE, new Product(Product.Type.BBQ_SAUCE, BigDecimal.valueOf(5)));
        foodQuantities.put(Product.Type.CHICKEN, new Product(Product.Type.CHICKEN, BigDecimal.valueOf(5)));
        foodQuantities.put(Product.Type.FILLET, new Product(Product.Type.FILLET, BigDecimal.valueOf(5)));
        foodQuantities.put(Product.Type.CUCUMBER, new Product(Product.Type.CUCUMBER, BigDecimal.valueOf(5)));
        foodQuantities.put(Product.Type.CHEESE, new Product(Product.Type.CHEESE, BigDecimal.valueOf(5)));
        foodQuantities.put(Product.Type.PEPERONI, new Product(Product.Type.PEPERONI, BigDecimal.valueOf(6)));
        foodQuantities.put(Product.Type.YELLOW_CHEESE, new Product(Product.Type.YELLOW_CHEESE, BigDecimal.valueOf(5)));
        foodQuantities.put(Product.Type.PARSLEY, new Product(Product.Type.PARSLEY, BigDecimal.valueOf(5)));
        foodQuantities.put(Product.Type.LETTUCE, new Product(Product.Type.LETTUCE, BigDecimal.valueOf(5)));
        foodQuantities.put(Product.Type.ARUGULA, new Product(Product.Type.ARUGULA, BigDecimal.valueOf(5)));
        foodQuantities.put(Product.Type.CARROT, new Product(Product.Type.CARROT, BigDecimal.valueOf(5)));
        foodQuantities.put(Product.Type.CABBAGE, new Product(Product.Type.CABBAGE, BigDecimal.valueOf(5)));
        foodQuantities.put(Product.Type.CORN, new Product(Product.Type.CORN, BigDecimal.valueOf(5)));
        foodQuantities.put(Product.Type.ONION, new Product(Product.Type.ONION, BigDecimal.valueOf(5)));
        foodQuantities.put(Product.Type.CHEDDAR, new Product(Product.Type.CHEDDAR, BigDecimal.valueOf(5)));

        this.alcoholQuantities = new HashMap<>();
        alcoholQuantities.put(Alcohol.Type.VODKA, new Alcohol(Alcohol.Type.VODKA, BigDecimal.valueOf(10)));
        alcoholQuantities.put(Alcohol.Type.WHISKY, new Alcohol(Alcohol.Type.WHISKY, BigDecimal.valueOf(10)));
        alcoholQuantities.put(Alcohol.Type.RUM, new Alcohol(Alcohol.Type.RUM, BigDecimal.valueOf(10)));
        alcoholQuantities.put(Alcohol.Type.ROSE, new Alcohol(Alcohol.Type.ROSE, BigDecimal.valueOf(10)));
        alcoholQuantities.put(Alcohol.Type.RED_WINE, new Alcohol(Alcohol.Type.RED_WINE, BigDecimal.valueOf(10)));
        alcoholQuantities.put(Alcohol.Type.WHITE_WINE, new Alcohol(Alcohol.Type.WHITE_WINE, BigDecimal.valueOf(10)));
        alcoholQuantities.put(Alcohol.Type.SCHNAPPS, new Alcohol(Alcohol.Type.SCHNAPPS, BigDecimal.valueOf(10)));

        this.bottleDrinksQuantities = new HashMap<>();
        bottleDrinksQuantities.put(BottleDrinks.Type.SPRITE, new BottleDrinks(BottleDrinks.Type.SPRITE, BigDecimal.valueOf(10)));
        bottleDrinksQuantities.put(BottleDrinks.Type.FANTA, new BottleDrinks(BottleDrinks.Type.FANTA, BigDecimal.valueOf(10)));
        bottleDrinksQuantities.put(BottleDrinks.Type.COCA_COLA, new BottleDrinks(BottleDrinks.Type.COCA_COLA, BigDecimal.valueOf(10)));
        bottleDrinksQuantities.put(BottleDrinks.Type.CAPPY_APPLE, new BottleDrinks(BottleDrinks.Type.CAPPY_APPLE, BigDecimal.valueOf(10)));
        bottleDrinksQuantities.put(BottleDrinks.Type.CAPPY_ORANGE, new BottleDrinks(BottleDrinks.Type.CAPPY_ORANGE, BigDecimal.valueOf(10)));
        bottleDrinksQuantities.put(BottleDrinks.Type.BIRICHKA, new BottleDrinks(BottleDrinks.Type.BIRICHKA, BigDecimal.valueOf(10)));
        bottleDrinksQuantities.put(BottleDrinks.Type.QK_PUSTINQK, new BottleDrinks(BottleDrinks.Type.QK_PUSTINQK, BigDecimal.valueOf(10)));
        bottleDrinksQuantities.put(BottleDrinks.Type.BASH_PUSTINQK, new BottleDrinks(BottleDrinks.Type.BASH_PUSTINQK, BigDecimal.valueOf(10)));
        bottleDrinksQuantities.put(BottleDrinks.Type.BLAG_PUSTINQK, new BottleDrinks(BottleDrinks.Type.BLAG_PUSTINQK, BigDecimal.valueOf(10)));
        bottleDrinksQuantities.put(BottleDrinks.Type.ZAGORKA_RETRO, new BottleDrinks(BottleDrinks.Type.ZAGORKA_RETRO, BigDecimal.valueOf(10)));
        bottleDrinksQuantities.put(BottleDrinks.Type.ZAGORKA_SPECIAL, new BottleDrinks(BottleDrinks.Type.ZAGORKA_SPECIAL, BigDecimal.valueOf(10)));
        bottleDrinksQuantities.put(BottleDrinks.Type.WATTER, new BottleDrinks(BottleDrinks.Type.WATTER, BigDecimal.valueOf(10)));
        bottleDrinksQuantities.put(BottleDrinks.Type.PIRINSKO, new BottleDrinks(BottleDrinks.Type.PIRINSKO, BigDecimal.valueOf(10)));
        bottleDrinksQuantities.put(BottleDrinks.Type.STELLA_ARTOIS, new BottleDrinks(BottleDrinks.Type.STELLA_ARTOIS, BigDecimal.valueOf(10)));
        bottleDrinksQuantities.put(BottleDrinks.Type.HEINIKEN, new BottleDrinks(BottleDrinks.Type.HEINIKEN, BigDecimal.valueOf(10)));
        bottleDrinksQuantities.put(BottleDrinks.Type.SOMERSBY, new BottleDrinks(BottleDrinks.Type.SOMERSBY, BigDecimal.valueOf(10)));
    }

    public static Warehouse getInstance() {

        if (warehouse == null) {
            warehouse = new Warehouse();
        }
        return warehouse;
    }

    public Map<Product.Type, Product> getFoodQuantities() {
        return foodQuantities;
    }

    public Map<Alcohol.Type, Alcohol> getAlcoholQuantities() {
        return alcoholQuantities;
    }

    public Map<BottleDrinks.Type, BottleDrinks> getBottleDrinksQuantities() {
        return bottleDrinksQuantities;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "foodQuantities=" + foodQuantities +
                ", alcoholQuantities=" + alcoholQuantities +
                ", bottleDrinksQuantities=" + bottleDrinksQuantities +
                "}\n\n\n\n";
    }
}
