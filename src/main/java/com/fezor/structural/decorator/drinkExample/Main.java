package main.java.com.fezor.structural.decorator.drinkExample;

import main.java.com.fezor.structural.decorator.drinkExample.additional.Chocolate;
import main.java.com.fezor.structural.decorator.drinkExample.additional.Milk;
import main.java.com.fezor.structural.decorator.drinkExample.drinks.Coffee;
import main.java.com.fezor.structural.decorator.drinkExample.drinks.Drink;

public class Main {
    public static void main(String[] args) {
        Drink drink = new Coffee();
        drink = new Milk(drink);
        drink = new Chocolate(drink);

        System.out.println(drink.getDescription() + " = " + drink.cost());
    }
}
