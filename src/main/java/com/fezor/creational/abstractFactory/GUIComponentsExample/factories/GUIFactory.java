package main.java.com.fezor.creational.abstractFactory.GUIComponentsExample.factories;

import main.java.com.fezor.creational.abstractFactory.GUIComponentsExample.buttons.Button;
import main.java.com.fezor.creational.abstractFactory.GUIComponentsExample.checkboxes.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckbox();
}
