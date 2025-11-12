package main.java.com.fezor.creational.builder.carProductionExample.director;

import main.java.com.fezor.creational.builder.carProductionExample.builders.Builder;
import main.java.com.fezor.creational.builder.carProductionExample.cars.CarType;
import main.java.com.fezor.creational.builder.carProductionExample.components.Engine;
import main.java.com.fezor.creational.builder.carProductionExample.components.GPSNavigator;
import main.java.com.fezor.creational.builder.carProductionExample.components.Transmission;
import main.java.com.fezor.creational.builder.carProductionExample.components.TripComputer;

public class Director {
    public void constructSportsCar(Builder builder){
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder){
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(5);
        builder.setEngine(new Engine(1.0,0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder){
        builder.setCarType(CarType.SUV);
        builder.setSeats(5);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}
