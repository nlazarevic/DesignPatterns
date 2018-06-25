package command;

public class RedoCommand implements CommandInterface{

    private Receiver receiver;

    public RedoCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void Do() {
        receiver.performRedo();
    }
}
