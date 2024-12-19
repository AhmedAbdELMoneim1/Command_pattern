package Commands;
import ReceiverDevices.TV;
public class TVOn implements CommandsInterface{
    TV tv;
    public TVOn(TV tv){
        this.tv = tv;
    }
    @Override
    public void execute() {tv.turnOn();}
    @Override
    public void undo() {tv.turnOff();}
}
