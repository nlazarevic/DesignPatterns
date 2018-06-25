package command;

public class CommandPattern {

    public static void main(String[] atgs){
        System.out.println("---COMMAND PATTERN---");
        Receiver intendedReceiver = new Receiver();
        Invoke invoke = new Invoke();
        UndoCommand undo = new UndoCommand(intendedReceiver);
        RedoCommand redo = new RedoCommand(intendedReceiver);
        invoke.executeCommand(undo);
        invoke.executeCommand(redo);
    }
}
