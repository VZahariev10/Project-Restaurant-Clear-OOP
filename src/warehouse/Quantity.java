package warehouse;

import java.math.BigDecimal;

public class Quantity {
    private BigDecimal quantity;
    private Unit unit;

    public enum Unit {
        L, G, KG, ML, Count
    }


    public Quantity(BigDecimal quantity, Unit unit) {
        this.quantity = quantity;
        this.unit = unit;
    }

    /**
     * small to big is a method, that we created for just easier transform grams or mililitres to kilos and litres
     * @return quantity of type "BigDecimal
     */
    public BigDecimal smallToBig() {
        switch (unit) {
            case G:
                return BigDecimal.valueOf((quantity.doubleValue() / 1000));
            case ML:
                return BigDecimal.valueOf((quantity.doubleValue() / 700));
        }
        return quantity;
    }
    /**
     * small to big is a method, that we created for just easier transform kilos and litres to grams or mililitres
     * @return quantity of type "BigDecimal
     */
    public BigDecimal bigToSmall() {
        switch (unit) {
            case KG:
            case L:
                return quantity.multiply(BigDecimal.valueOf(1000));
        }
        return quantity;
    }

    public BigDecimal count() {
        switch (unit) {
            case Count:
                return quantity.multiply(BigDecimal.ONE);
        }
        return quantity;
    }

    @Override
    public String toString() {
        return "Quantity{" +
                "quantity=" + quantity +
                ", unit=" + unit +
                '}';
    }
}
