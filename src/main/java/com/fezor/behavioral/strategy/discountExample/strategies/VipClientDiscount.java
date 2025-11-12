package main.java.com.fezor.behavioral.strategy.discountExample.strategies;

public class VipClientDiscount implements DiscountStrategy{
    @Override
    public double applyDiscount(double value) {
        return value * 0.9;
    }
}
