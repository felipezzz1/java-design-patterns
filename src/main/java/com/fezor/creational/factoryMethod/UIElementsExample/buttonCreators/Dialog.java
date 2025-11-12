package main.java.com.fezor.creational.factoryMethod.UIElementsExample.buttonCreators;

import main.java.com.fezor.creational.factoryMethod.UIElementsExample.button.Button;

public abstract class Dialog {

    public void render() {
        Button button = createButton();
        button.onClick();
        button.render();
        System.out.println("The button has been rendered...");
    }

    public abstract Button createButton();
}
