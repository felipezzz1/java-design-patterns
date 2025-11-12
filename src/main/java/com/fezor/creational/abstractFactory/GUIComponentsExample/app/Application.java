package main.java.com.fezor.creational.abstractFactory.GUIComponentsExample.app;

import main.java.com.fezor.creational.abstractFactory.GUIComponentsExample.buttons.Button;
import main.java.com.fezor.creational.abstractFactory.GUIComponentsExample.checkboxes.CheckBox;
import main.java.com.fezor.creational.abstractFactory.GUIComponentsExample.factories.GUIFactory;

public class Application {
    private Button button;
    private CheckBox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
