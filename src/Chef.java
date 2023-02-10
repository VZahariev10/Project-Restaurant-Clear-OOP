import menu.Pizza;
import menu.Recipe;
import menu.Salad;
import warehouse.Product;
import warehouse.Quantity;
import warehouse.Warehouse;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;

public class Chef extends Employee {

    private BigDecimal salary = new BigDecimal(1200);
    Map<Product.Type, BigDecimal> availableProduct;
    Recipe recipe = new Recipe();
    CheckOut checkOut = new CheckOut();

    public Chef(String name, BigDecimal salary) {
        super(name);
        this.salary = salary;
        availableProduct = new HashMap<>();
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void makePizza(Pizza.PizzaType pizzaType, Pizza.PizzaSize pizzaSize) {
        Optional<Pizza> pizzaToPrepare = new Recipe().getPizzaList().stream().
                filter(pizza -> pizza.getPizzaType() == pizzaType && pizza.getPizzaSize() == pizzaSize).findFirst();

        if (pizzaToPrepare.isPresent()) {
            pizzaToPrepare.get().getNeededIngredients().forEach(new BiConsumer<Product.Type, Quantity>() {
                @Override
                public void accept(Product.Type type, Quantity quantity) {
                    Warehouse.getInstance().getFoodQuantities().computeIfPresent(type, (k, v) -> v.subtractQuantity(quantity));
                }
            });
        } else {
            System.out.println("Not found pizza");
        }

    }

    public void makeSalad(Salad.SaladType saladType, Salad.SaladSize saladSize) {
        Optional<Salad> saladToPrepare = new Recipe().getSaladList().stream().
                filter(salad -> salad.getSaladType() == saladType && salad.getSaladSize() == saladSize).findFirst();
        if (saladToPrepare.isPresent()) {
            saladToPrepare.get().getNeededIngredients().forEach((type, quantity)
                    -> Warehouse.getInstance().getFoodQuantities().computeIfPresent(type, (k, v) -> v.subtractQuantity(quantity)));

        } else {
            System.out.println("Not found salad");
        }
    }

    public void readyPizza(Pizza.PizzaType type, Pizza.PizzaSize size) {
        System.out.println(getName() + " : " + size + " pizza " + type + " is ready!");
    }

    public void readySalad(Salad.SaladType type) {
        System.out.println(getName() + " : salad " + type + " is ready!");
    }
}