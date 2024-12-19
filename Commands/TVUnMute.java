package Commands;
import ReceiverDevices.TV;

public class TVUnMute implements CommandsInterface{
    TV tv;
    public TVUnMute(TV tv){
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.UnMute();
    }
    @Override
    public void undo() {
        tv.mute();
    }
}
