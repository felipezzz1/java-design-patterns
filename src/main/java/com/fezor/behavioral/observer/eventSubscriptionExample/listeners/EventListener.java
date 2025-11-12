package main.java.com.fezor.behavioral.observer.eventSubscriptionExample.listeners;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}
