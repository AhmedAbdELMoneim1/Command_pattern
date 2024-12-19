package Commands;

import ReceiverDevices.Light;

public class LightON implements CommandsInterface{
    Light light;
    public LightON(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.turnOn();
    }
    @Override
    public void undo() {
        light.turnOff();
    }
}
