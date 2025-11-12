package main.java.com.fezor.behavioral.strategy.discountExample.strategies;

public class NormalClientDiscount implements DiscountStrategy{
    @Override
    public double applyDiscount(double value) {
        return value * 0.95;
    }
}
