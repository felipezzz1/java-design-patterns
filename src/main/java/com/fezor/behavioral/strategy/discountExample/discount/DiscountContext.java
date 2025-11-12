package main.java.com.fezor.behavioral.strategy.discountExample.discount;

import main.java.com.fezor.behavioral.strategy.discountExample.strategies.DiscountStrategy;

public class DiscountContext {
    private DiscountStrategy strategy;

    public void setStrategy(DiscountStrategy strategy){
        this.strategy = strategy;
    }

    public double calculate(double value){
        return strategy.applyDiscount(value);
    }
}
