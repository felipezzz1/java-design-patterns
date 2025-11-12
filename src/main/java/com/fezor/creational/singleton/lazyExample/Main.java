package main.java.com.fezor.creational.singleton.lazyExample;

public class Main {
    public static void main(String[] args) {
        SingletonLazyInitialization lazySingleton1 = SingletonLazyInitialization.getInstance();
        SingletonLazyInitialization lazySingleton2 = SingletonLazyInitialization.getInstance();

        lazySingleton1.sayHello();

        System.out.println(lazySingleton1 == lazySingleton2);
    }
}
