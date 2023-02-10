package utils;

import warehouse.Alcohol;
import warehouse.Product;
import warehouse.Quantity;

import java.math.BigDecimal;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class Utils {
    /**
     * Method, which calculates the Price of every single Pizza, using a stream method that goes over all
     * keys and their values. The Atomic reference is a Java class, which wraps any primitive types.
     * <p>
     * Map @param "Map<Product.Type, Quantity> neededIngredients"
     *
     * @return the final Price of the dreamed Pizza.
     */
    public static BigDecimal calculateFoodPrice(Map<Product.Type, Quantity> neededIngredients) {
        AtomicReference<BigDecimal> price = new AtomicReference<>(BigDecimal.ZERO);
        neededIngredients.forEach((type, quantity) -> {
            price.updateAndGet(v -> (BigDecimal) (v.add(type.getDeliveryPrice().multiply(quantity.smallToBig()
                    .multiply(BigDecimal.valueOf(5))))));
        });
        return price.get();
    }
//BigDecimal
//    public static double calculateAlcoholPrice(Map<Alcohol.Type, Quantity> alcohol) {
//        AtomicReference<Double> price = new AtomicReference<>((double) 0);
//        alcohol.forEach((type, quantity) -> {
//            price.updateAndGet(v -> (double) (v + (type.getDeliveryPrice() * quantity.smallToBig() * 5)));
//        });
//        return price.get();
//
//    }
}
