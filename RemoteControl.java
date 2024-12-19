import Commands.CommandsInterface;

import java.util.ArrayList;

// Invoker Class
public class RemoteControl {
    ArrayList<CommandsInterface> commands = new  ArrayList<>();

    public void addCommand(CommandsInterface command){
        commands.add(command);
    }

    public void executeCommandByIndex(int index){
        if (commands.size() > index) commands.get(index).execute();
    }
    public void undoCommandByIndex(int index){
        if (commands.size() > index) commands.get(index).undo();
    }
    public void executeCommands(){
        for (CommandsInterface command:commands)
            command.execute();
        commands.clear();
    }
    public void undoCommands(){
        for (CommandsInterface command:commands)
            command.undo();
        commands.clear();
    }
}
