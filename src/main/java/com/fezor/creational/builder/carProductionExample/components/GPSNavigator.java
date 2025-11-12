package main.java.com.fezor.creational.builder.carProductionExample.components;

public class GPSNavigator {
    private String route;

    public GPSNavigator(){
        this.route = "221b, Baker Street, Londo to Scotland Yard, 8-10 Broadway, Londor";
    }

    public GPSNavigator(String manualRoute){
        this.route = manualRoute;
    }

    public String getRoute(){
        return route;
    }
}
