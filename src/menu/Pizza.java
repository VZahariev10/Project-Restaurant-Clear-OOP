package menu;

import utils.Utils;
import warehouse.Product;
import warehouse.Quantity;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;

public class Pizza {
    private PizzaType pizzaType;
    private PizzaSize pizzaSize;
    private Map<Product.Type, Quantity> neededIngredients;
    private BigDecimal price;

    public Pizza(PizzaType pizzaType, PizzaSize pizzaSize, Map<Product.Type, Quantity> neededIngredients) {
        this.pizzaType = pizzaType;
        this.pizzaSize = pizzaSize;
        this.neededIngredients = neededIngredients;
        this.price = Utils.calculateFoodPrice(neededIngredients).setScale(2, RoundingMode.HALF_UP);

    }


    public enum PizzaType {
        MARGARITA,
        LEO_ITALIANO,
        CALCONE,
        CLASSIC,
        TEXAS,
        KAPRI;
    }

    public enum PizzaSize {
        SMALL(350),
        LARGE(450);
        private int weight;

        PizzaSize(int weight) {
            this.weight = weight;
        }
    }

    public Map<Product.Type, Quantity> getNeededIngredients() {
        return neededIngredients;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "\nPizza{" +
                "pizzaType=" + pizzaType +
                ", pizzaSize=" + pizzaSize +
                ", neededIngredients=" + neededIngredients +
                ", price=" + price +
                "}\n\n";
    }
}
