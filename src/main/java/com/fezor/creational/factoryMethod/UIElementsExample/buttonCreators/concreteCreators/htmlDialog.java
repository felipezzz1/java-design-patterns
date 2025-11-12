package main.java.com.fezor.creational.factoryMethod.UIElementsExample.buttonCreators.concreteCreators;

import main.java.com.fezor.creational.factoryMethod.UIElementsExample.button.Button;
import main.java.com.fezor.creational.factoryMethod.UIElementsExample.button.htmlButton;
import main.java.com.fezor.creational.factoryMethod.UIElementsExample.buttonCreators.Dialog;

public class htmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new htmlButton();
    }
}
