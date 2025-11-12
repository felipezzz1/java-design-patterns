package main.java.com.fezor.creational.abstractFactory.cardPaymentExample.products.debitCard;

public class MasterDebit implements DebitCard{
    @Override
    public void validate() {
        System.out.println("validating Master debit card...");
    }
}
