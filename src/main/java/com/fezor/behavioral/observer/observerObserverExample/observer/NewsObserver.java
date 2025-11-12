package main.java.com.fezor.behavioral.observer.observerObserverExample.observer;

public class NewsObserver implements ObserverListener{
    private String name;

    public NewsObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " receive: " + message);
    }
}
