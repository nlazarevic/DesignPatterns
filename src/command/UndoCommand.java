package command;

public class UndoCommand implements CommandInterface {

    private Receiver receiver;

    public UndoCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void Do() {
        receiver.performUndo();
    }
}
