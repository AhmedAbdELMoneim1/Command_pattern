package Commands;

import ReceiverDevices.TV;
public class TVOff implements CommandsInterface{
    TV tv;
    public TVOff(TV tv){
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.turnOff();
    }
    @Override
    public void undo() {
        tv.turnOn();
    }
}
