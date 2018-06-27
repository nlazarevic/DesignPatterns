package memento;

public class MementoPattern {
    public static void main(String[] args){
        System.out.println("---MEMENTO PATTERN---");
        Originator o = new Originator();
        o.setState("First state");

        // holding old state
        Caretaker c = new Caretaker();
        c.saveMemento(o.originatorMemento());

        // changing state
        o.setState("Second state");

        // restore saved state
        o.revert(c.retrieveMemento());
        System.out.println("---END OF MEMENTO PATTERN---");
    }
}
