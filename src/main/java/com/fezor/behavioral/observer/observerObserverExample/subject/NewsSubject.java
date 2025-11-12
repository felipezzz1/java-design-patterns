package main.java.com.fezor.behavioral.observer.observerObserverExample.subject;

import main.java.com.fezor.behavioral.observer.observerObserverExample.observer.ObserverListener;

import java.util.ArrayList;
import java.util.List;

public class NewsSubject implements Subject{
    private List<ObserverListener> observers = new ArrayList<>();

    @Override
    public void addObserver(ObserverListener observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(ObserverListener observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers(String message) {
        observers.forEach(observer -> observer.update(message));
    }
}
