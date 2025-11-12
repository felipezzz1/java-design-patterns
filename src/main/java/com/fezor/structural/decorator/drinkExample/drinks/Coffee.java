package main.java.com.fezor.structural.decorator.drinkExample.drinks;

public class Coffee implements Drink{
    @Override
    public String getDescription() {
        return "Coffee";
    }

    @Override
    public double cost() {
        return 5.0;
    }
}
