package main.java.com.fezor.structural.decorator.drinkExample.drinkDecorators;

import main.java.com.fezor.structural.decorator.drinkExample.drinks.Drink;

public abstract class DrinkDecorator implements Drink {
    protected Drink drink;

    public DrinkDecorator(Drink drink) {
        this.drink = drink;
    }
}
