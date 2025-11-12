package main.java.com.fezor.creational.singleton.normalExample;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = new Singleton("10", "windows");

        System.out.println("Operating system: " + singleton.getOperatingSystem());
        System.out.println("Version: " + singleton.getVersion());
    }
}
