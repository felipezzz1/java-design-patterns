package main.java.com.fezor.behavioral.command.lightExample;

import main.java.com.fezor.behavioral.command.lightExample.commands.LightOffCommand;
import main.java.com.fezor.behavioral.command.lightExample.commands.LightOnCommand;
import main.java.com.fezor.behavioral.command.lightExample.invoker.Remote;
import main.java.com.fezor.behavioral.command.lightExample.receiver.Light;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Remote remote = new Remote();

        remote.setCommand(new LightOnCommand(light));
        remote.pressButton();

        remote.setCommand(new LightOffCommand(light));
        remote.pressButton();
    }
}
