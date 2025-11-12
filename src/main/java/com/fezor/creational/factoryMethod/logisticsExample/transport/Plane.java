package main.java.com.fezor.creational.factoryMethod.logisticsExample.transport;

public class Plane implements Transport {
    @Override
    public void deliver(){
        System.out.println("Deliver via air (Plane)...");
    }
}
