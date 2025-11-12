package main.java.com.fezor.creational.builder.carProductionExample.builders;

import main.java.com.fezor.creational.builder.carProductionExample.cars.CarType;
import main.java.com.fezor.creational.builder.carProductionExample.components.Engine;
import main.java.com.fezor.creational.builder.carProductionExample.components.GPSNavigator;
import main.java.com.fezor.creational.builder.carProductionExample.components.Transmission;
import main.java.com.fezor.creational.builder.carProductionExample.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
