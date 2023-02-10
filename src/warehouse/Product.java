package warehouse;

import java.math.BigDecimal;

public class Product {
    private final Type type;//ТУК ИЗПОЛЗВАМ ФАЙНЪЛ ЗА ДА ИЗБЯГАМЕ ОТ "NULL" и му задаваме дефолтна стойност "Ънноун".
    private BigDecimal availability;

    public static enum Type {
        BATTER(new Quantity(BigDecimal.valueOf(1), Quantity.Unit.KG), BigDecimal.valueOf(1)),
        TOMATO_SAUCE(new Quantity(BigDecimal.valueOf(1), Quantity.Unit.KG), BigDecimal.valueOf(3.5)),
        HAM(new Quantity(BigDecimal.valueOf(1), Quantity.Unit.KG), BigDecimal.valueOf(8)),
        MOZARELLA(new Quantity(BigDecimal.valueOf(1), Quantity.Unit.KG), BigDecimal.valueOf(7)),
        MUSHROOM(new Quantity(BigDecimal.valueOf(1), Quantity.Unit.KG), BigDecimal.valueOf(5)),
        TOMATO(new Quantity(BigDecimal.valueOf(1), Quantity.Unit.KG), BigDecimal.valueOf(10.6)),
        BBQ_SAUCE(new Quantity(BigDecimal.valueOf(1), Quantity.Unit.KG), BigDecimal.valueOf(6)),
        CHICKEN(new Quantity(BigDecimal.valueOf(1), Quantity.Unit.KG), BigDecimal.valueOf(9)),
        FILLET(new Quantity(BigDecimal.valueOf(1), Quantity.Unit.KG), BigDecimal.valueOf(13)),
        CUCUMBER(new Quantity(BigDecimal.valueOf(1), Quantity.Unit.KG), BigDecimal.valueOf(4)),
        CHEESE(new Quantity(BigDecimal.valueOf(1), Quantity.Unit.KG), BigDecimal.valueOf(8)),
        PEPERONI(new Quantity(BigDecimal.valueOf(1), Quantity.Unit.KG), BigDecimal.valueOf(6)),
        YELLOW_CHEESE(new Quantity(BigDecimal.valueOf(1), Quantity.Unit.KG), BigDecimal.valueOf(9)),
        PARSLEY(new Quantity(BigDecimal.valueOf(1), Quantity.Unit.KG), BigDecimal.valueOf(10)),
        LETTUCE(new Quantity(BigDecimal.valueOf(1), Quantity.Unit.KG), BigDecimal.valueOf(8)),
        ARUGULA(new Quantity(BigDecimal.valueOf(1), Quantity.Unit.KG), BigDecimal.valueOf(5)),
        CARROT(new Quantity(BigDecimal.valueOf(1), Quantity.Unit.KG), BigDecimal.valueOf(5)),
        CABBAGE(new Quantity(BigDecimal.valueOf(1), Quantity.Unit.KG), BigDecimal.valueOf(4)),
        CORN(new Quantity(BigDecimal.valueOf(1), Quantity.Unit.KG), BigDecimal.valueOf(10)),
        ONION(new Quantity(BigDecimal.valueOf(1), Quantity.Unit.KG), BigDecimal.valueOf(4)),
        CHEDDAR(new Quantity(BigDecimal.valueOf(1), Quantity.Unit.KG), BigDecimal.valueOf(11)),
        UNKNOWN(new Quantity(BigDecimal.ZERO, Quantity.Unit.KG), BigDecimal.ZERO);

        private Quantity quantity;
        private BigDecimal deliveryPrice;

        //A constructor, who help us to initialize the delivery price for a kilo of every product.
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

    public Product(Type type, BigDecimal availability) {
        this.availability = availability;
        this.type = type;
    }

    public Product() {
        availability = BigDecimal.valueOf(1);
        type = Type.UNKNOWN;
    }

    public Product subtractQuantity(Quantity quantity) {
        availability = availability.subtract(quantity.smallToBig());
        return new Product(type, availability);
    }

    public Type getType() {
        return type;
    }

    public BigDecimal getAvailability() {
        return availability;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type=" + type +
                ", availability=" + availability +
                '}';
    }
}

