package by.bntu.fitr.povt.patterns.command.controller;

import by.bntu.fitr.povt.patterns.command.commandClass.Command;

public class SimpleRemoteControl {
    Command[] onCommand;
    Command[] offCommand;
    Command undoCommand;

    public SimpleRemoteControl() {
        onCommand = new Command[7];
        offCommand = new Command[7];
        Command noCommand = () -> {
        };
        for (int i = 0; i < 7; i++) {
            onCommand[i] = noCommand;
            offCommand[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommand[slot] = onCommand;
        this.offCommand[slot] = offCommand;
    }

    public void onButtonPressed(int slot) {
        onCommand[slot].execute();
        undoCommand = onCommand[slot];
    }

    public void offButtonPressed(int slot) {
        offCommand[slot].execute();
        undoCommand = offCommand[slot];
    }

    public void undoButtonPressed() {

    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommand.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommand[i].getClass().getName()
                    + "                " + offCommand[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}
