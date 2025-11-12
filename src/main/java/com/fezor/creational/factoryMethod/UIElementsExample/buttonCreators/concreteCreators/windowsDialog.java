package main.java.com.fezor.creational.factoryMethod.UIElementsExample.buttonCreators.concreteCreators;

import main.java.com.fezor.creational.factoryMethod.UIElementsExample.button.Button;
import main.java.com.fezor.creational.factoryMethod.UIElementsExample.button.windowsButton;
import main.java.com.fezor.creational.factoryMethod.UIElementsExample.buttonCreators.Dialog;

public class windowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new windowsButton();
    }
}
