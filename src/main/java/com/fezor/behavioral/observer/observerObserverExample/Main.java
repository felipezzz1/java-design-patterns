package main.java.com.fezor.behavioral.observer.observerObserverExample;

import main.java.com.fezor.behavioral.observer.observerObserverExample.observer.NewsObserver;
import main.java.com.fezor.behavioral.observer.observerObserverExample.observer.ObserverListener;
import main.java.com.fezor.behavioral.observer.observerObserverExample.subject.NewsSubject;

public class Main {
    public static void main(String[] args) {
        NewsSubject news = new NewsSubject();

        ObserverListener observer1 = new NewsObserver("John");
        ObserverListener observer2 = new NewsObserver("Button");

        news.addObserver(observer1);
        news.addObserver(observer2);

        news.notifyAllObservers("News about something new!!!");
    }
}
