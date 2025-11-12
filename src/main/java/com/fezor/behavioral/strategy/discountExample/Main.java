package main.java.com.fezor.behavioral.strategy.discountExample;

import main.java.com.fezor.behavioral.strategy.discountExample.discount.DiscountContext;
import main.java.com.fezor.behavioral.strategy.discountExample.strategies.BlackFridayDiscount;
import main.java.com.fezor.behavioral.strategy.discountExample.strategies.NormalClientDiscount;
import main.java.com.fezor.behavioral.strategy.discountExample.strategies.VipClientDiscount;

public class Main {
    public static void main(String[] args) {
        DiscountContext context = new DiscountContext();

        context.setStrategy(new NormalClientDiscount());
        System.out.println(context.calculate(100));

        context.setStrategy(new VipClientDiscount());
        System.out.println(context.calculate(100));

        context.setStrategy(new BlackFridayDiscount());
        System.out.println(context.calculate(100));
    }
}
