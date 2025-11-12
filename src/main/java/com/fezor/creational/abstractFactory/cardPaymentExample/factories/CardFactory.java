package main.java.com.fezor.creational.abstractFactory.cardPaymentExample.factories;

import main.java.com.fezor.creational.abstractFactory.cardPaymentExample.products.creditCard.CreditCard;
import main.java.com.fezor.creational.abstractFactory.cardPaymentExample.products.debitCard.DebitCard;

public interface CardFactory {
    CreditCard createCredit();
    DebitCard createDebit();
}
