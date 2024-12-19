package Commands;

import ReceiverDevices.TV;

public class TVMute implements CommandsInterface{
    TV tv;
    public TVMute(TV tv){
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.mute();
    }
    @Override
    public void undo() {
        tv.UnMute();
    }
}
