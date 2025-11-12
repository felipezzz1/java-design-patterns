package main.java.com.fezor.creational.factoryMethod.logisticsExample.transportCreators.concreteCreators;

import main.java.com.fezor.creational.factoryMethod.logisticsExample.transport.Transport;
import main.java.com.fezor.creational.factoryMethod.logisticsExample.transport.Truck;
import main.java.com.fezor.creational.factoryMethod.logisticsExample.transportCreators.Logistics;

public class RoadLogistics extends Logistics {

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
