package main.java.com.fezor.creational.abstractFactory.cardPaymentExample.factories;

import main.java.com.fezor.creational.abstractFactory.cardPaymentExample.products.creditCard.CreditCard;
import main.java.com.fezor.creational.abstractFactory.cardPaymentExample.products.creditCard.MasterCredit;
import main.java.com.fezor.creational.abstractFactory.cardPaymentExample.products.debitCard.DebitCard;
import main.java.com.fezor.creational.abstractFactory.cardPaymentExample.products.debitCard.MasterDebit;

public class MasterFactory implements CardFactory{
    @Override
    public CreditCard createCredit() {
        return new MasterCredit();
    }

    @Override
    public DebitCard createDebit() {
        return new MasterDebit();
    }
}
