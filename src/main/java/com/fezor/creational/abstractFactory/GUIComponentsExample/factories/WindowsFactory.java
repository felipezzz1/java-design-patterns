package main.java.com.fezor.creational.abstractFactory.GUIComponentsExample.factories;

import main.java.com.fezor.creational.abstractFactory.GUIComponentsExample.buttons.Button;
import main.java.com.fezor.creational.abstractFactory.GUIComponentsExample.buttons.WindowsButton;
import main.java.com.fezor.creational.abstractFactory.GUIComponentsExample.checkboxes.CheckBox;
import main.java.com.fezor.creational.abstractFactory.GUIComponentsExample.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new WindowsCheckbox();
    }
}
