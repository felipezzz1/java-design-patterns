package main.java.com.fezor.creational.factoryMethod.logisticsExample;

import main.java.com.fezor.creational.factoryMethod.logisticsExample.transportCreators.Logistics;
import main.java.com.fezor.creational.factoryMethod.logisticsExample.transportCreators.concreteCreators.AirLogistics;
import main.java.com.fezor.creational.factoryMethod.logisticsExample.transportCreators.concreteCreators.RoadLogistics;
import main.java.com.fezor.creational.factoryMethod.logisticsExample.transportCreators.concreteCreators.SeaLogistics;

public class Main {
    public static void main(String[] args) {
        Logistics logistics;

        System.out.println("Client: Choose road logistics for local delivey");
        logistics = new RoadLogistics();
        logistics.planDelivery();

        System.out.println("----------------------------------------------");

        System.out.println("Client: Choose sea logistics...");
        logistics = new SeaLogistics();
        logistics.planDelivery();

        System.out.println("----------------------------------------------");

        System.out.println("Client: Choose air logistics...");
        logistics = new AirLogistics();
        logistics.planDelivery();

    }
}
