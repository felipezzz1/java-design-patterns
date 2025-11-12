package main.java.com.fezor.behavioral.strategy.discountExample.strategies;

public class BlackFridayDiscount implements DiscountStrategy{
    @Override
    public double applyDiscount(double value) {
        return value * 0.5;
    }
}
