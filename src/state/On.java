package state;

public class On extends RemoteControl {
    @Override
    public void pressSwitch(TV context) {
        System.out.println("I am already ON. Going to be OFF now.");
        context.setState(new Off());
    }
}
