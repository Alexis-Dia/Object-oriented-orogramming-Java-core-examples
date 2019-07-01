package by.bntu.fitr.povt.patterns.command;

import by.bntu.fitr.povt.patterns.command.commandClass.Command;
import by.bntu.fitr.povt.patterns.command.controller.SimpleRemoteControl;
import by.bntu.fitr.povt.patterns.command.device.Light;
import by.bntu.fitr.povt.patterns.command.device.Stereo;

public class ApplicationLambda {

    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Stereo stereo = new Stereo("Stereo CD in Hall");


        remoteControl.setCommand(0, ()->{livingRoomLight.on();}, ()->{livingRoomLight.off();});
        remoteControl.setCommand(1, kitchenLight::on, kitchenLight::off);
        Command stereoOnWithCD = () -> {stereo.on();stereo.setCD();stereo.setVolume(13);};
        remoteControl.setCommand(3,stereoOnWithCD,stereo::off);

        remoteControl.onButtonPressed(0);
        remoteControl.offButtonPressed(0);
        remoteControl.onButtonPressed(1);
        remoteControl.offButtonPressed(1);
        remoteControl.onButtonPressed(3);
        remoteControl.offButtonPressed(3);
        System.out.println(remoteControl);
    }
}
