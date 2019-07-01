package by.bntu.fitr.povt.patterns.command.commandClass;

import by.bntu.fitr.povt.patterns.command.device.Light;

public class LightOffCommand implements Command{
    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }


    public void undo() {
        light.on();
    }
}
