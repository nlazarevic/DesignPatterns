package command;

public class Invoke {

    CommandInterface command;

    public void executeCommand(CommandInterface cmd){
        this.command = cmd;
        command.Do();
    }
}
