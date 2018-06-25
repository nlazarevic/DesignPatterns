package command;

public class Receiver {
    public void performUndo(){
        System.out.println("Executing - UndoCommand");
    }

    public void performRedo(){
        System.out.println("Executing - RedoCommand");
    }
}
