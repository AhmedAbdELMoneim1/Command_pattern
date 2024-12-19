package Commands;

import ReceiverDevices.Light;
public class LightOFF implements CommandsInterface{
    Light light;
    public LightOFF(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.turnOff();
    }
    @Override
    public void undo() {
        light.turnOn();
    }
}
