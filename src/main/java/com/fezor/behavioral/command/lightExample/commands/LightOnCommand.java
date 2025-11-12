package main.java.com.fezor.behavioral.command.lightExample.commands;

import main.java.com.fezor.behavioral.command.lightExample.receiver.Light;

public class LightOnCommand implements Command{
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
