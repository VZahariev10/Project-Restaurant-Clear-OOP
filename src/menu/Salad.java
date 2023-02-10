package menu;

import utils.Utils;
import warehouse.Product;
import warehouse.Quantity;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;

public class Salad {
    private Salad.SaladType saladType;
    private Salad.SaladSize saladSize;
    private Map<Product.Type, Quantity> neededIngredients;
    private BigDecimal price;

    public Salad(Salad.SaladType saladType, Salad.SaladSize saladSize, Map<Product.Type, Quantity> neededIngredients) {
        this.saladType = saladType;
        this.saladSize = saladSize;
        this.neededIngredients = neededIngredients;
        this.price = Utils.calculateFoodPrice(neededIngredients).setScale(2, RoundingMode.HALF_UP);

    }


    public enum SaladType {
        SHOPSKA,
        OVCHARSKA,
        TOMATOS_AND_MOZZARELA,
        CEZAR,
        FANTASY;
    }

    public enum SaladSize {
        NORMAL(350);
        private int weight;

        SaladSize(int weight) {
            this.weight = weight;
        }
    }

    public SaladType getSaladType() {
        return saladType;
    }

    public SaladSize getSaladSize() {
        return saladSize;
    }

    public Map<Product.Type, Quantity> getNeededIngredients() {
        return neededIngredients;
    }

    public BigDecimal getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "\nSalad{" +
                "saladType=" + saladType +
                ", saladSize=" + saladSize +
                ", neededIngredients=" + neededIngredients +
                ", price=" + price +
                "}\n\n";
    }
}
