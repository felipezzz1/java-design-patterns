package main.java.com.fezor.creational.abstractFactory.GUIComponentsExample.factories;

import main.java.com.fezor.creational.abstractFactory.GUIComponentsExample.buttons.Button;
import main.java.com.fezor.creational.abstractFactory.GUIComponentsExample.buttons.MacOSButton;
import main.java.com.fezor.creational.abstractFactory.GUIComponentsExample.checkboxes.CheckBox;
import main.java.com.fezor.creational.abstractFactory.GUIComponentsExample.checkboxes.MacOSCheckBox;

public class MacOSFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new MacOSCheckBox();
    }
}
