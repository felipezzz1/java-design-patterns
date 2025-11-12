package main.java.com.fezor.creational.factoryMethod.logisticsExample.transport;

public class Truck implements Transport {
    @Override
    public void deliver(){
        System.out.println("Deliver via land(Truck)...");
    }
}
