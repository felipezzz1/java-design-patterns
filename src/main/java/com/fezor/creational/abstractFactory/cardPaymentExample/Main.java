package main.java.com.fezor.creational.abstractFactory.cardPaymentExample;

import main.java.com.fezor.creational.abstractFactory.cardPaymentExample.factories.CardFactory;
import main.java.com.fezor.creational.abstractFactory.cardPaymentExample.factories.VisaFactory;
import main.java.com.fezor.creational.abstractFactory.cardPaymentExample.products.creditCard.CreditCard;
import main.java.com.fezor.creational.abstractFactory.cardPaymentExample.products.debitCard.DebitCard;

public class Main {
    public static void main(String[] args) {
        CardFactory factory = new VisaFactory();

        CreditCard creditCard = factory.createCredit();
        DebitCard debitCard = factory.createDebit();

        creditCard.validate();
        debitCard.validate();
    }
}
