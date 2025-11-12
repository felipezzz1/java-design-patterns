package main.java.com.fezor.creational.factoryMethod.logisticsExample.transport;

public class Ship implements Transport {
    @Override
    public void deliver(){
        System.out.println("Deliver via sea (Ship)...");
    }
}
