package state;

public class Off extends RemoteControl {

    @Override
    public void pressSwitch(TV context) {
        System.out.println("I am OFF. Going to be ON now.");
        context.setState(new On());
    }
}
