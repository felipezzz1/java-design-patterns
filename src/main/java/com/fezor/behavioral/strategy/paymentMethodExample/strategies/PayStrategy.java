package main.java.com.fezor.behavioral.strategy.paymentMethodExample.strategies;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
