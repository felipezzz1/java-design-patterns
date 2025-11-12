package main.java.com.fezor.behavioral.command.lightExample.commands;

import main.java.com.fezor.behavioral.command.lightExample.receiver.Light;

public class LightOffCommand implements Command{
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
