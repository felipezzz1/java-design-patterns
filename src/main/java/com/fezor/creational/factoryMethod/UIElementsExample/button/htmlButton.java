package main.java.com.fezor.creational.factoryMethod.UIElementsExample.button;

public class htmlButton implements Button{
    @Override
    public void render() {
        System.out.println("Rendering a HTML button...");
    }

    @Override
    public void onClick() {
        System.out.println("HTML button has been clicked...");
    }
}
