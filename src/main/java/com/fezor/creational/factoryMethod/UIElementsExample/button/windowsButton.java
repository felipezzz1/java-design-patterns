package main.java.com.fezor.creational.factoryMethod.UIElementsExample.button;

public class windowsButton implements Button{
    @Override
    public void render() {
        System.out.println("Rendering a windows button...");
    }

    @Override
    public void onClick() {
        System.out.println("Windows button has been clicked...");
    }
}
