

import menu.Pizza;
import menu.Recipe;
import menu.Salad;
import menu.Statistic;
import warehouse.Alcohol;
import warehouse.BottleDrinks;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Order {
    public static void main(String[] args) {
        // }public void ElementsOfMenu() {
        Random rand = new Random();
        Recipe recipe = new Recipe();
        CheckOut checkOut = new CheckOut();
        Chef pizzaMaker = new Chef("chef Asen", BigDecimal.valueOf(2000));
        Chef saladMaker = new Chef("chef Ivan", BigDecimal.valueOf(1500));
        Waitress waitress = new Waitress("Darinka", BigDecimal.valueOf(1500), new BigDecimal(0));
        Barman alcoholBarman = new Barman("Petar", BigDecimal.valueOf(1300));
        Barman nonAlcoholBarman = new Barman("Mitko", BigDecimal.valueOf(1300));
        List<Pizza> pizzaList = recipe.getPizzaList();
        List<Salad> saladList = recipe.getSaladList();
        List<Alcohol> alcoholList = recipe.getAlcoholList();
        List<BottleDrinks> bottleDrinks = recipe.getBottleDrinksList();


        BigDecimal sum = new BigDecimal("0.0");
        BigDecimal daySum = BigDecimal.ZERO;
        BigDecimal totalSumForMonth = BigDecimal.ZERO;


        BigDecimal tipPercentage = BigDecimal.valueOf(0.20);
        for (int m = 1; m <= 30; m++) {

            System.out.println("Day " + m + "\n");
            for (int i = 1; i <= 30; i++) {
                boolean giveTipOrNot =new Random().nextBoolean();
                waitress.greetings();
                System.out.println("ORDER: " + i);
                int numberOfPizzaElements = 1;
                for (int a = 0; a < numberOfPizzaElements; a++) {
                    int randomIndex = rand.nextInt(pizzaList.size());
                    System.out.println(pizzaList.get(randomIndex).getPizzaType() + " - " + pizzaList.get(randomIndex).getPizzaSize()
                            + " - " + pizzaList.get(randomIndex).getPrice());
                    sum = sum.add(pizzaList.get(randomIndex).getPrice());

                    Statistic.getInstance().updateStatisticPizza(pizzaList.get(randomIndex));
                    waitress.setOrderedPizzaType(pizzaList.get(randomIndex).getPizzaType());
                    waitress.setOrderedPizzaSize(pizzaList.get(randomIndex).getPizzaSize());

                }

                int numberOfSaladsElements = 1;
                for (int c = 0; c < numberOfSaladsElements; c++) {
                    int randomIndex = rand.nextInt(saladList.size());
                    System.out.println(saladList.get(randomIndex).getSaladType() + " - " + saladList.get(randomIndex).getSaladSize()
                            + " - " + saladList.get(randomIndex).getPrice());
                    sum = sum.add(saladList.get(randomIndex).getPrice());

                    Statistic.getInstance().updateStatisticSalad(saladList.get(randomIndex));
                    waitress.setOrderedSaladType(saladList.get(randomIndex).getSaladType());
                    waitress.setOrderedSaladSize(saladList.get(randomIndex).getSaladSize());

                }

                int numberOfAlcoholElements = 1;
                for (int d = 0; d < numberOfAlcoholElements; d++) {
                    int randomIndex = rand.nextInt(alcoholList.size());
                    System.out.println(alcoholList.get(randomIndex).getType() + " - " + alcoholList.get(randomIndex).getAlcoholSize()
                            + " - " + alcoholList.get(randomIndex).getPrice());
                    sum = sum.add(alcoholList.get(randomIndex).getPrice());

                    Statistic.getInstance().updateStatisticAlcohol(alcoholList.get(randomIndex));
                    waitress.setOrderedAlcoholType(alcoholList.get(randomIndex).getType());
                    waitress.setOrderedAlcoholSize(alcoholList.get(randomIndex).getAlcoholSize());


                }

                int numberOfNonAlcoholElements = 1;
                for (int j = 0; j < numberOfNonAlcoholElements; j++) {
                    int randomIndex = rand.nextInt(bottleDrinks.size());
                    System.out.println(bottleDrinks.get(randomIndex).getType() + " - " + bottleDrinks.get(randomIndex).getPrice());
                    sum = sum.add(bottleDrinks.get(randomIndex).getPrice());

                    Statistic.getInstance().updateStatisticBottleDrinks(bottleDrinks.get(randomIndex));
                    waitress.setOrderedBottleDrinks(bottleDrinks.get(randomIndex).getType());
                }
                if (giveTipOrNot){
                    waitress.setTips(sum.multiply(BigDecimal.valueOf(0.20)));
                    sum= sum.add(waitress.getTips());
                }

                pizzaMaker.makePizza(waitress.getOrderedPizzaType().get(i - 1), waitress.getOrderedPizzaSize().get(i - 1));
                saladMaker.makeSalad(waitress.getOrderedSaladType().get(i - 1), waitress.getOrderedSaladSize().get(i - 1));
                alcoholBarman.alcoholToServe(waitress.getOrderedAlcoholType().get(i - 1), waitress.getOrderedAlcoholSize().get(i - 1));
                nonAlcoholBarman.bottleDrinksToServe(waitress.getOrderedBottleDrinks().get(i - 1));

                System.out.println("----------------");

                pizzaMaker.readyPizza(waitress.getOrderedPizzaType().get(i - 1), waitress.getOrderedPizzaSize().get(i - 1));
                saladMaker.readySalad(waitress.getOrderedSaladType().get(i - 1));
                alcoholBarman.readyAlcohol(waitress.getOrderedAlcoholType().get(i - 1), waitress.getOrderedAlcoholSize().get(i - 1), i);
                nonAlcoholBarman.readyNonAlcohol(waitress.getOrderedBottleDrinks().get(i - 1), i);
                waitress.enjoyYourMeal();
                System.out.println("\nTips " + waitress.getTips());
                System.out.println("TOTAL : " + sum.setScale(2, RoundingMode.HALF_UP)+ "\n");
                waitress.goodbye();
                totalSumForMonth = totalSumForMonth.add(sum);

                daySum = daySum.add(sum);
                checkOut.setDailyIncomes(daySum);
                sum = BigDecimal.ZERO;

                checkOut.setMonthIncome(totalSumForMonth);

            }
            System.out.println("\nEnd of day " + m + " sum : " + checkOut.getDailyIncomes() + "\n\n");
            daySum = BigDecimal.ZERO;
            checkOut.setDailyIncomes(daySum);
        }
        Statistic.getInstance().deletePizzas();
        Statistic.getInstance().deleteSalad();
        System.out.println(Recipe.getInstance().getPizzaList());

        System.out.println("Total sum for Month :" + checkOut.getMonthIncome().setScale(2, RoundingMode.HALF_UP));

        BigDecimal salaries = new BigDecimal(0);
        salaries = salaries.add(waitress.getSalary()).add(alcoholBarman.getSalary())
                .add(pizzaMaker.getSalary().add(saladMaker.getSalary())
                        .add(nonAlcoholBarman.getSalary()));
        checkOut.setExpenses(salaries);
        System.out.println("Аll salaries for the month are : " + checkOut.getExpenses());

        BigDecimal won;
        won = checkOut.getMonthIncome().subtract(checkOut.getExpenses());
        checkOut.setFinalMonth(won);
        System.out.println("You won : " + checkOut.getFinalMonth() + " for this month!");

    }
}
