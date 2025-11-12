package main.java.com.fezor.behavioral.observer.eventSubscriptionExample;

import main.java.com.fezor.behavioral.observer.eventSubscriptionExample.editor.Editor;
import main.java.com.fezor.behavioral.observer.eventSubscriptionExample.listeners.EmailNotificationListener;
import main.java.com.fezor.behavioral.observer.eventSubscriptionExample.listeners.LogOpenListener;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();

        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
