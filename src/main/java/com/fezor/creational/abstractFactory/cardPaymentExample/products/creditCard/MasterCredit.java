package main.java.com.fezor.creational.abstractFactory.cardPaymentExample.products.creditCard;

public class MasterCredit implements CreditCard{
    @Override
    public void validate() {
        System.out.println("Validating MASTER credit card...");
    }
}
