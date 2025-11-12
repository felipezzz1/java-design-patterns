package main.java.com.fezor.structural.decorator.drinkExample.additional;

import main.java.com.fezor.structural.decorator.drinkExample.drinkDecorators.DrinkDecorator;
import main.java.com.fezor.structural.decorator.drinkExample.drinks.Drink;

public class Chocolate extends DrinkDecorator {
    public Chocolate(Drink drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + " + Chocolate";
    }

    @Override
    public double cost() {
        return drink.cost() + 3.0;
    }
}
