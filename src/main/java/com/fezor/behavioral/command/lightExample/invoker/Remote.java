package main.java.com.fezor.behavioral.command.lightExample.invoker;

import main.java.com.fezor.behavioral.command.lightExample.commands.Command;

public class Remote {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }
}
