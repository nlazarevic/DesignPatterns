package state;

public class StatePattern {
    public static void main(String[] args){
        System.out.println("---STATE PATTERN---");
        Off initialState = new Off();
        TV tv = new TV(initialState);

        // first time press
        tv.pressState();

        // second time press
        tv.pressState();

        // third time press
        tv.pressState();

        // fourth time press
        tv.pressState();
        System.out.println("---END OF STATE PATTERN---");
    }
}
