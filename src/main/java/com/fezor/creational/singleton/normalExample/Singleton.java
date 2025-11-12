package main.java.com.fezor.creational.singleton.normalExample;

public class Singleton {

    private String version;
    private String operating_system;

    public Singleton(String version, String operating_system) {
        this.version = version;
        this.operating_system = operating_system;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getOperatingSystem() {
        return operating_system;
    }

    public void setOperatingSystem(String operating_system) {
        this.operating_system = operating_system;
    }
}
