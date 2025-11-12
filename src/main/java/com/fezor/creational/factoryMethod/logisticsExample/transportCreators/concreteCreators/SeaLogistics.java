package main.java.com.fezor.creational.factoryMethod.logisticsExample.transportCreators.concreteCreators;

import main.java.com.fezor.creational.factoryMethod.logisticsExample.transport.Ship;
import main.java.com.fezor.creational.factoryMethod.logisticsExample.transport.Transport;
import main.java.com.fezor.creational.factoryMethod.logisticsExample.transportCreators.Logistics;

public class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
