package main.java.com.fezor.creational.abstractFactory.cardPaymentExample.products.creditCard;

public class VisaCredit implements CreditCard{
    @Override
    public void validate() {
        System.out.println("Validating VISA credit card...");
    }
}
