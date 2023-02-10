package menu;


import warehouse.Alcohol;
import warehouse.BottleDrinks;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class Statistic {
    private Map<Pizza, Integer> statisticPizza;
    private Map<Salad, Integer> statisticSalad;
    private Map<Alcohol, Integer> statisticAlcohol;
    private Map<BottleDrinks, Integer> statisticBottleDrinks;

    private static Statistic statistic = null;

    public Statistic() {
        this.statisticPizza = new LinkedHashMap<>();
        this.statisticSalad = new LinkedHashMap<>();
        this.statisticAlcohol = new LinkedHashMap<>();
        this.statisticBottleDrinks = new LinkedHashMap<>();
    }

    /**
     * "updateStatisticPizza" method, that counts how often is pizza of a type ordered, and saves this statistic.
     * @param pizza
     */
    public void updateStatisticPizza(Pizza pizza) {
        if (!statisticPizza.containsKey(pizza)) {
            statisticPizza.put(pizza, 1);
        } else {
            statisticPizza.put(pizza, statisticPizza.get(pizza) + 1);
        }
    }

    /**
     * "updateStatisticSalad" is method, that counts how often is salad of a type ordered, and saves this statistic.
     * @param salad
     */
    public void updateStatisticSalad(Salad salad) {
        if (!statisticSalad.containsKey(salad)) {
            statisticSalad.put(salad, 1);
        } else {
            statisticSalad.put(salad, statisticSalad.get(salad) + 1);
        }
    }

    /**
     * "updateStatisticAlcohol" is method, that counts how often is salad of a type ordered, and saves this statistic.
     * @param alcohol
     */
    public void updateStatisticAlcohol(Alcohol alcohol) {
        if (!statisticAlcohol.containsKey(alcohol)) {
            statisticAlcohol.put(alcohol, 1);
        } else {
            statisticAlcohol.put(alcohol, statisticAlcohol.get(alcohol) + 1);
        }
    }

    /**
     * "updateStatisticBottleDrink" is method, that counts how often is salad of a type ordered, and saves this statistic.
     * @param bottleDrinks
     */

    public void updateStatisticBottleDrinks(BottleDrinks bottleDrinks) {
        if (!statisticBottleDrinks.containsKey(bottleDrinks)) {
            statisticBottleDrinks.put(bottleDrinks, 1);
        } else {
            statisticBottleDrinks.put(bottleDrinks, statisticBottleDrinks.get(bottleDrinks) + 1);
        }
    }

    public Map<Pizza, Integer> getStatisticPizza() {
        return statisticPizza;
    }

    public Map<Salad, Integer> getStatisticSalad() {
        return statisticSalad;
    }

    public Map<Alcohol, Integer> getStatisticAlcohol() {
        return statisticAlcohol;
    }

    public Map<BottleDrinks, Integer> getStatisticBottleDrinks() {
        return statisticBottleDrinks;
    }

    public static Statistic getInstance() {
        if (statistic == null) {
            statistic = new Statistic();
        }
        return statistic;
    }

    public void printStatisticPizza() {
        statisticPizza.forEach((pizza, integer) -> {
            System.out.println(pizza.getPizzaType() + " " + pizza.getPizzaSize() + " is ordered " + integer + " times");
        });
    }

    public void printStatisticSalad() {
        statisticSalad.forEach((salad, integer) -> {
            System.out.println(salad.getSaladType() + " is ordered " + integer + " times");
        });
    }

    public void printStatisticAlcohol() {
        statisticAlcohol.forEach((alcohol, integer) -> {
            System.out.println(alcohol.getType() + " is ordered " + integer + " times");
        });
    }

    public void printStatisticBottleDrinks() {
        statisticBottleDrinks.forEach((bottleDrinks, integer) -> {
            System.out.println(bottleDrinks.getType() + " is ordered " + integer + " times");
        });
    }

    /**
     * "deletePizza" is method that clears the two Last two pizzas, that are ordered least often.
     */
    public void deletePizzas() {
        int leastOrdered = Integer.MAX_VALUE;
        Pizza keyToDelete = null;

        for (Pizza key : statisticPizza.keySet()) {
            if (statisticPizza.get(key) < leastOrdered) {
                keyToDelete = key;
            }
        }
        if (keyToDelete != null) {
            // statisticPizza.remove(keyToDelete);
            Recipe.getInstance().getPizzaList().remove(keyToDelete);
        }

//        leastOrdered = Integer.MAX_VALUE;
//        keyToDelete = null;
//        for (Pizza key : statisticPizza.keySet()) {
//            if (statisticPizza.get(key) < leastOrdered) {
//                keyToDelete = key;
//            }
//        }
//        if (keyToDelete != null) {
//            //statisticPizza.remove(keyToDelete);
//            Recipe.getInstance().getPizzaList().remove(keyToDelete);
//        }
    }
    /**
     * "deleteSalad" is method that clears the two Last two salads, that are ordered least often.
     */
    public void deleteSalad() {
        int leastOrdered = Integer.MAX_VALUE;
        Salad keyToDelete = null;

        for (Salad key : statisticSalad.keySet()) {
            if (statisticSalad.get(key) < leastOrdered) {
                keyToDelete = key;
            }
        }
        if (keyToDelete != null) {
            //statisticSalad.remove(keyToDelete);
            Recipe.getInstance().getSaladList().remove(keyToDelete);
        }
//        leastOrdered = Integer.MAX_VALUE;
//        keyToDelete = null;
//        for (Salad key : statisticSalad.keySet()) {
//            if (statisticSalad.get(key) < leastOrdered) {
//                keyToDelete = key;
//            }
//        }
//        if (keyToDelete != null) {
//            //statisticSalad.remove(keyToDelete);
//            Recipe.getInstance().getSaladList().remove(keyToDelete);
//        }
    }
}

