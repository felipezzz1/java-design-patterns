package main.java.com.fezor.structural.decorator.drinkExample.additional;

import main.java.com.fezor.structural.decorator.drinkExample.drinkDecorators.DrinkDecorator;
import main.java.com.fezor.structural.decorator.drinkExample.drinks.Drink;

public class Milk extends DrinkDecorator {
    public Milk(Drink drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + " + Milk";
    }

    @Override
    public double cost() {
        return drink.cost() + 2.0;
    }
}
