package main.java.com.fezor.behavioral.observer.observerObserverExample.subject;

import main.java.com.fezor.behavioral.observer.observerObserverExample.observer.ObserverListener;

public interface Subject {
    void addObserver(ObserverListener observer);
    void removeObserver(ObserverListener observer);
    void notifyAllObservers(String message);
}
