package by.bntu.fitr.povt.patterns.command.commandClass;

import by.bntu.fitr.povt.patterns.command.device.Stereo;

public class StereoOffCommand implements Command{
    Stereo stereo;

    public StereoOffCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }


    public void undo() {
        stereo.on();
    }
}
