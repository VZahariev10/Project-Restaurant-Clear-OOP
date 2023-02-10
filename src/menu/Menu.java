package menu;

import warehouse.Alcohol;
import warehouse.BottleDrinks;

import java.util.*;

public class Menu {
    private List<Recipe> menu;
    private List<Pizza> pizzas;
    private List<Salad> salads;
    private List<Alcohol> alcohol;
    private List<BottleDrinks> bottleDrinks;

    public Menu() {
        menu = new ArrayList<>();
        menu.add(Recipe.getInstance());
        this.pizzas = new ArrayList<>();
        this.salads = new ArrayList<>();
        this.alcohol = new ArrayList<>();
        this.bottleDrinks = new ArrayList<>();
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public void addPizza(Pizza pizza) {
        this.pizzas.add(pizza);
    }

    public List<Salad> getSalads() {
        return salads;
    }

    public void setSalads(List<Salad> salads) {
        this.salads = salads;
    }

    public void addSalad(Salad salad) {
        this.salads = salads;
    }

    public List<Alcohol> getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(List<Alcohol> alcohol) {
        this.alcohol = alcohol;
    }

    public void addAlcohol(Alcohol alcohol1) {
        this.alcohol.add(alcohol1);
    }


    public List<BottleDrinks> getBottleDrinks() {
        return bottleDrinks;
    }

    public void setBottleDrinks(List<BottleDrinks> bottleDrinks) {
        this.bottleDrinks = bottleDrinks;
    }

    public void addBottleDrinks(BottleDrinks bottleDrinks) {
        this.bottleDrinks.add(bottleDrinks);
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menu=" + menu +
                "}\n\n\n";
    }
}
