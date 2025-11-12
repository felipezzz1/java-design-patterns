package main.java.com.fezor.creational.abstractFactory.GUIComponentsExample;

import main.java.com.fezor.creational.abstractFactory.GUIComponentsExample.app.Application;
import main.java.com.fezor.creational.abstractFactory.GUIComponentsExample.factories.GUIFactory;
import main.java.com.fezor.creational.abstractFactory.GUIComponentsExample.factories.MacOSFactory;
import main.java.com.fezor.creational.abstractFactory.GUIComponentsExample.factories.WindowsFactory;

public class Main {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();

        if(osName.contains("mac")){
            factory = new MacOSFactory();
        } else{
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
