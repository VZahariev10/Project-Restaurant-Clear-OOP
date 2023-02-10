import menu.Recipe;
import warehouse.Alcohol;
import warehouse.BottleDrinks;
import warehouse.Quantity;
import warehouse.Warehouse;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;

public class Barman extends Employee {
    private BigDecimal salary = new BigDecimal(1200);
    private Map<Alcohol.Type, BigDecimal> alcohol;
    private Map<BottleDrinks.Type, BigDecimal> bottleDrinks;
    CheckOut checkOut = new CheckOut();


    public Barman(String name, BigDecimal salary) {
        super(name);
        this.salary = salary;
        alcohol = new HashMap<>();
        bottleDrinks = new HashMap<>();
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void alcoholToServe(Alcohol.Type alcoholType, Alcohol.AlcoholSize alcoholSize) {
        Optional<Alcohol> alcoholToserve = new Recipe().getAlcoholList().stream()
                .filter(alcohol -> alcohol.getType() == alcoholType && alcohol.getAlcoholSize() == alcoholSize)
                .findFirst();

        if (alcoholToserve.isPresent()) {
            alcoholToserve.get().getNeedAlcohol().forEach((type, quantity) -> Warehouse.getInstance().getAlcoholQuantities()
                    .computeIfPresent(type, (k, v) -> v.subtractQuantity(quantity)));
        } else {
            System.out.println("Not found alcohol");
        }
    }

    public void bottleDrinksToServe(BottleDrinks.Type botlleDrinksType) {
        Optional<BottleDrinks> bottleDrinks = new Recipe().getBottleDrinksList().stream()
                .filter(bottleDrinks1 -> bottleDrinks1.getType() == botlleDrinksType)
                .findFirst();
        if (bottleDrinks.isPresent()) {
            bottleDrinks.get().getBottleDrinks().forEach((type, quantity) -> Warehouse.getInstance().getBottleDrinksQuantities()
                    .computeIfPresent(type, (k, v) -> v.subtractQuantity(quantity)));
        } else {
            System.out.println("Not found soft drinks");
        }
    }

    public void readyAlcohol(Alcohol.Type type, Alcohol.AlcoholSize size, int i) {
        System.out.println(getName() + " : " + size + " " + type + " for order No: " + i);
    }

    public void readyNonAlcohol(BottleDrinks.Type type, int i) {
        System.out.println(getName() + " : " + " " + type + " for order No: " + i);
    }

}