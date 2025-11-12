package main.java.com.fezor.creational.abstractFactory.GUIComponentsExample.checkboxes;

public class MacOSCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
