package main.java.com.fezor.creational.factoryMethod.logisticsExample.transportCreators;

import main.java.com.fezor.creational.factoryMethod.logisticsExample.transport.Transport;

public abstract class Logistics {

    public void planDelivery(){
        Transport transport = createTransport();

        System.out.println("--- Starting Delivery Plan ---");

        transport.deliver();
        System.out.println("--- Delivery Completed");
    }

    public abstract Transport createTransport();
}
