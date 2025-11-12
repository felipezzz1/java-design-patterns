package main.java.com.fezor.creational.builder.carProductionExample;

import main.java.com.fezor.creational.builder.carProductionExample.builders.CarBuilder;
import main.java.com.fezor.creational.builder.carProductionExample.builders.CarManualBuilder;
import main.java.com.fezor.creational.builder.carProductionExample.cars.Car;
import main.java.com.fezor.creational.builder.carProductionExample.cars.Manual;
import main.java.com.fezor.creational.builder.carProductionExample.director.Director;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();

        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
