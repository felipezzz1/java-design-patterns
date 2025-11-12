package main.java.com.fezor.creational.singleton.lazyExample;

public class SingletonLazyInitialization {

    private static SingletonLazyInitialization instance;

    private SingletonLazyInitialization() {}

    public static SingletonLazyInitialization getInstance() {
        if(instance == null) {
            instance = new SingletonLazyInitialization();
        }
        return instance;
    }

    public void sayHello(){
        System.out.println("Singleton Works");
    }
}
