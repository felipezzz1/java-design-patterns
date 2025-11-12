package main.java.com.fezor.creational.abstractFactory.cardPaymentExample.products.debitCard;

public class VisaDebit implements DebitCard {
    @Override
    public void validate() {
        System.out.println("Validating VISA debit card...");
    }
}
