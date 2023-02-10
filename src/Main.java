import menu.Menu;
import menu.Statistic;
import warehouse.Warehouse;

public class Main {
    public static void main(String[] args) {
        Menu myMenu = new Menu();
        Restaurant restaurant = new Restaurant();
        System.out.println(Warehouse.getInstance().getAlcoholQuantities());
        System.out.println(Warehouse.getInstance().getBottleDrinksQuantities());
        System.out.println(Warehouse.getInstance().getFoodQuantities());
        System.out.println("\n\n");
        System.out.println("WELCOME TO PIZZERIA " + restaurant.getName() + "!");
        System.out.println(myMenu);

        MainClient.main(args);
        System.out.println("\n\n");

        Order.main(args);
//        System.out.println("\n\n");
//        Statistic.getInstance().printStatisticPizza();
//        System.out.println("\n\n");
//
//        Statistic.getInstance().printStatisticSalad();
//        System.out.println("\n\n");
//
//        Statistic.getInstance().printStatisticAlcohol();
//        System.out.println("\n\n");
//
        Statistic.getInstance().printStatisticBottleDrinks();
        System.out.println(Warehouse.getInstance().getFoodQuantities());
        System.out.println(Warehouse.getInstance().getBottleDrinksQuantities());

    }
}
