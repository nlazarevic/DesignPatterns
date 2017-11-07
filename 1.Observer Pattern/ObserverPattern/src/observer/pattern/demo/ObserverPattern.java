package observer.pattern.demo;

public class ObserverPattern {
    public static void main(String[] args){
        System.out.println("OBSERVER PATTERN DEMO");

        Observer o1 = new Observer();
        Observer o2 = new Observer();

        Subject s = new Subject();

        System.out.println("Registering two Observers");
        s.register(o1);
        s.register(o2);

        System.out.println("Setting flag to 1");
        s.setFlag(1);
        System.out.println("Setting flag to 5");
        s.setFlag(5);
        System.out.println("Unregister one Observer(one left)");
        s.unregister(o2);
        System.out.println("Setting flag to 10");
        s.setFlag(10);
        System.out.println("Unregister one Observer(no observers left)");
        s.unregister(o1);
        System.out.println("Setting flag to 15");
        s.setFlag(15);
    }
}
