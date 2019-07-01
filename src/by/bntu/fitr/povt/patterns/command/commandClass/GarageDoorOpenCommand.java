package by.bntu.fitr.povt.patterns.command.commandClass;

import by.bntu.fitr.povt.patterns.command.device.GarageDoor;

public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }


    public void undo() {
        garageDoor.down();
    }
}