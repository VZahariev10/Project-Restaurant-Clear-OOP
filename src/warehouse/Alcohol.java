package warehouse;

import utils.Utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;

public class Alcohol {
    private final Type type;
    //ТУК ИЗПОЛЗВАМ ФАЙНЪЛ ЗА ДА ИЗБЯГАМЕ ОТ "NULL" и му задаваме дефолтна стойност "Ънноун".
    private BigDecimal availability;
    private AlcoholSize alcoholSize;
    private BigDecimal price;
    private Map<Type, Quantity> needAlcohol;

    public Alcohol(Type type, AlcoholSize alcoholSize, Map<Alcohol.Type, Quantity> needAlcohol) {
        this.type = type;
        this.alcoholSize = alcoholSize;
        this.needAlcohol = needAlcohol;
        this.price = type.getDeliveryPrice().multiply
                (needAlcohol.get(type).smallToBig()).multiply(BigDecimal.valueOf(5)).setScale(2, RoundingMode.HALF_UP);
    }

//BigDec constr.
    public enum Type {
        VODKA(new Quantity(BigDecimal.valueOf(700), Quantity.Unit.ML), BigDecimal.valueOf(14)),
        WHISKY(new Quantity(BigDecimal.valueOf(700), Quantity.Unit.ML), BigDecimal.valueOf(18)),
        RUM(new Quantity(BigDecimal.valueOf(700), Quantity.Unit.ML), BigDecimal.valueOf(11)),
        ROSE(new Quantity(BigDecimal.valueOf(700), Quantity.Unit.ML), BigDecimal.valueOf(8)),
        RED_WINE(new Quantity(BigDecimal.valueOf(700), Quantity.Unit.ML), BigDecimal.valueOf(9)),
        WHITE_WINE(new Quantity(BigDecimal.valueOf(700), Quantity.Unit.ML), BigDecimal.valueOf(10)),
        SCHNAPPS(new Quantity(BigDecimal.valueOf(700), Quantity.Unit.ML), BigDecimal.valueOf(11)),
        UNKNOWN(new Quantity(BigDecimal.valueOf(0), Quantity.Unit.ML), BigDecimal.valueOf(0));

        private Quantity quantity;
        private BigDecimal deliveryPrice;

        Type(Quantity quantity, BigDecimal deliveryPrice) {
            this.quantity = quantity;
            this.deliveryPrice = deliveryPrice;
        }

        public Quantity getQuantity() {
            return quantity;
        }

        public BigDecimal getDeliveryPrice() {
            return deliveryPrice;
        }
    }

    public Alcohol(Type type, BigDecimal availability) {
        this.availability = availability;
        this.type = type;
    }

    public Alcohol() {
        availability = BigDecimal.ONE;
        type = Type.UNKNOWN;
    }

    public enum AlcoholSize {
        SMALL,
        Large;
        private int size;

        AlcoholSize() {
            this.size = size;
        }
    }

    public Type getType() {
        return type;
    }

    public BigDecimal getAvailability() {
        return availability;
    }

    public AlcoholSize getAlcoholSize() {
        return alcoholSize;
    }

    public Map<Type, Quantity> getNeedAlcohol() {
        return needAlcohol;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Alcohol subtractQuantity(Quantity quantity) {
        availability = availability.subtract(quantity.smallToBig());
        return new Alcohol(type, availability);
    }

    @Override
    public String toString() {
        return "Alcohol{" +
                "type=" + type +
                ", availability=" + availability +
                "}\n\n";
    }
}

