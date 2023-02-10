package warehouse;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;

public class BottleDrinks {
    private Type type;
    private Map<BottleDrinks.Type, Quantity> bottleDrinks;
    private BigDecimal price;
    private BigDecimal availability;

    public BottleDrinks(Type type, Map<BottleDrinks.Type, Quantity> bottleDrinks) {
        this.type = type;
        this.bottleDrinks = bottleDrinks;
        this.price = type.getDeliveryPrice().multiply(BigDecimal.valueOf(2.5)).setScale(2, RoundingMode.HALF_UP);
    }

    public Map<BottleDrinks.Type, Quantity> getBottleDrinks() {
        return bottleDrinks;
    }

    public static enum Type {
        FANTA(BigDecimal.valueOf(1)),
        COCA_COLA(BigDecimal.valueOf(1)),
        PIRINSKO(BigDecimal.valueOf(1.3)),
        STELLA_ARTOIS(BigDecimal.valueOf(1.6)),
        HEINIKEN(BigDecimal.valueOf(1.2)),
        ZAGORKA_SPECIAL(BigDecimal.valueOf(1.1)),
        ZAGORKA_RETRO(BigDecimal.valueOf(1.2)),
        BIRICHKA(BigDecimal.valueOf(1)),
        QK_PUSTINQK(BigDecimal.valueOf(1.1)),
        BASH_PUSTINQK(BigDecimal.valueOf(1.2)),
        BLAG_PUSTINQK(BigDecimal.valueOf(1.3)),
        SPRITE(BigDecimal.valueOf(1)),
        SOMERSBY(BigDecimal.valueOf(1.4)),
        WATTER(BigDecimal.valueOf(0.5)),
        CAPPY_ORANGE(BigDecimal.valueOf(1.2)),
        CAPPY_APPLE(BigDecimal.valueOf(1.2)),
        UNKNOWN(BigDecimal.ZERO);

        private BigDecimal deliveryPrice;
        private int count;

        public BigDecimal getDeliveryPrice() {
            return deliveryPrice;
        }

        Type(BigDecimal price) {
            this.deliveryPrice = price;
            this.count = 1;

        }
    }

    public Type getType() {
        return type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BottleDrinks(Type type, BigDecimal availability) {
        this.type = type;
        this.availability = availability;

    }

    public BottleDrinks subtractQuantity(Quantity quantity) {
        availability = availability.subtract(quantity.count());
        return new BottleDrinks(type, availability);
    }

    public BigDecimal getAvailability() {
        return availability;
    }

    @Override
    public String toString() {
        return "BottleDrinks{" +
                "type=" + type +
                ", availability=" + availability +
                "}\n\n";
    }
}
