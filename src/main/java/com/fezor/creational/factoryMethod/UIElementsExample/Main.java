package main.java.com.fezor.creational.factoryMethod.UIElementsExample;

import main.java.com.fezor.creational.factoryMethod.UIElementsExample.buttonCreators.Dialog;
import main.java.com.fezor.creational.factoryMethod.UIElementsExample.buttonCreators.concreteCreators.htmlDialog;
import main.java.com.fezor.creational.factoryMethod.UIElementsExample.buttonCreators.concreteCreators.windowsDialog;

public class Main {
    public static void main(String[] args) {
        Dialog dialog;

        System.out.println("Client: choose to create a HTML button...");
        dialog = new htmlDialog();
        dialog.render();

        System.out.println("----------------------------------------------");

        System.out.println("Client: Choose to create a Windows button...");
        dialog = new windowsDialog();
        dialog.render();
    }
}
