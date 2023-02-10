
import menu.Pizza;
import menu.Recipe;
import menu.Salad;
import warehouse.Alcohol;
import warehouse.BottleDrinks;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Waitress extends Employee {
    Random rand = new Random();
    Recipe recipe = new Recipe();
    CheckOut checkOut = new CheckOut();
    private BigDecimal tips;


    private List<Pizza.PizzaSize> orderedPizzaSize = new ArrayList<>();
    private List<Pizza.PizzaType> orderedPizzaType = new ArrayList<>();

    private List<Salad.SaladType> orderedSaladType = new ArrayList<>();
    private List<Salad.SaladSize> orderedSaladSize = new ArrayList<>();

    public BigDecimal getTips() {
        return tips;
    }

    public void setTips(BigDecimal tips) {
        this.tips = tips;
    }

    private List<Alcohol.Type> orderedAlcoholType = new ArrayList<>();
    private List<Alcohol.AlcoholSize> orderedAlcoholSize = new ArrayList<>();

    private List<BottleDrinks.Type> orderedBottleDrinks = new ArrayList<>();

    public List<BottleDrinks.Type> getOrderedBottleDrinks() {
        return orderedBottleDrinks;
    }

    public void setOrderedBottleDrinks(BottleDrinks.Type toAdd) {
        orderedBottleDrinks.add(toAdd);
    }

    public List<Alcohol.Type> getOrderedAlcoholType() {
        return orderedAlcoholType;
    }

    public void setOrderedAlcoholType(Alcohol.Type toAdd) {
        orderedAlcoholType.add(toAdd);
    }

    public List<Alcohol.AlcoholSize> getOrderedAlcoholSize() {
        return orderedAlcoholSize;
    }

    public void setOrderedAlcoholSize(Alcohol.AlcoholSize toAdd) {
        orderedAlcoholSize.add(toAdd);
    }

    public List<Salad.SaladType> getOrderedSaladType() {
        return orderedSaladType;
    }

    public void setOrderedSaladType(Salad.SaladType toAdd) {
        orderedSaladType.add(toAdd);
    }

    public List<Salad.SaladSize> getOrderedSaladSize() {
        return orderedSaladSize;
    }

    public void setOrderedSaladSize(Salad.SaladSize toAdd) {
        orderedSaladSize.add(toAdd);
    }


    public List<Pizza.PizzaType> getOrderedPizzaType() {
        return orderedPizzaType;
    }

    public void setOrderedPizzaType(Pizza.PizzaType toAdd) {
        orderedPizzaType.add(toAdd);
    }

    public List<Pizza.PizzaSize> getOrderedPizzaSize() {
        return orderedPizzaSize;
    }

    public void setOrderedPizzaSize(Pizza.PizzaSize alsoAdd) {
        orderedPizzaSize.add(alsoAdd);
    }

    public BigDecimal getSalary() {
        return salary;
    }

    private BigDecimal salary = new BigDecimal(1000);

    public Waitress(String name, BigDecimal salary , BigDecimal tips) {
        super(name);
        this.tips=tips;
    }

    public void greetings() {
        System.out.println(getName() + " : Hello, dear Clients!");
    }

    public void goodbye() {
        System.out.println(getName() + " : Thank you for being our client!\nHave a nice day!\n\n\n");
    }

    public void enjoyYourMeal() {
        System.out.println(getName() + " : Enjoy your meal :)");
    }
}