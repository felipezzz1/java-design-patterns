package main.java.com.fezor.creational.abstractFactory.cardPaymentExample.factories;

import main.java.com.fezor.creational.abstractFactory.cardPaymentExample.products.creditCard.CreditCard;
import main.java.com.fezor.creational.abstractFactory.cardPaymentExample.products.creditCard.VisaCredit;
import main.java.com.fezor.creational.abstractFactory.cardPaymentExample.products.debitCard.DebitCard;
import main.java.com.fezor.creational.abstractFactory.cardPaymentExample.products.debitCard.VisaDebit;

public class VisaFactory implements CardFactory{
    @Override
    public CreditCard createCredit() {
        return new VisaCredit();
    }

    @Override
    public DebitCard createDebit() {
        return new VisaDebit();
    }
}
