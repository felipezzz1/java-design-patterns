package main.java.com.fezor.creational.factoryMethod.logisticsExample.transportCreators.concreteCreators;

import main.java.com.fezor.creational.factoryMethod.logisticsExample.transportCreators.Logistics;
import main.java.com.fezor.creational.factoryMethod.logisticsExample.transport.Plane;
import main.java.com.fezor.creational.factoryMethod.logisticsExample.transport.Transport;

public class AirLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Plane();
    }
}
