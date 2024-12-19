import Commands.*;
import ReceiverDevices.Light;
import ReceiverDevices.TV;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        // receiver devices
        Light light = new Light();
        TV tv = new TV();

        // commands light
        LightON lightOnCommand = new LightON(light);
        LightOFF lightOffCommand = new LightOFF(light);

        // commands tv
        TVOn tvOn = new TVOn(tv);
        TVOff tvOff = new TVOff(tv);
        TVMute tvMute = new TVMute(tv);
        TVUnMute tvUnMute = new TVUnMute(tv);

        remoteControl.addCommand(tvOn);
        remoteControl.addCommand(tvMute);
        remoteControl.addCommand(lightOnCommand);

        remoteControl.undoCommandByIndex(0);

        remoteControl.executeCommands();




    }
}
