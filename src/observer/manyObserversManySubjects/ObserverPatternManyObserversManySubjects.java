package observer.manyObserversManySubjects;

import observer.Observer;
import observer.Subject;

public class ObserverPatternManyObserversManySubjects {
    public static void main(String[] args){
        System.out.println("OBSERVER PATTERN DEMO WITH MANY OBSERVERS AND MANY SUBJECTS");

        Observer1 o1 = new Observer1();
        Observer2 o2 = new Observer2();
        Observer3 o3 = new Observer3();

        Subject1 s1 = new Subject1();
        Subject2 s2 = new Subject2();

        System.out.println("Registering Observer1 and Observer2 to Subject1");
        s1.register(o1);
        s1.register(o2);

        System.out.println("Registering Observer2 and Observer3 to Subject2");
        s2.register(o2);
        s2.register(o3);

        System.out.println("Subject1: Setting flag to 1");
        s1.setFlag(1);
        System.out.println("Subject2: Setting flag to 5");
        s2.setFlag(5);
        System.out.println("Unregister Observer2 from Subject1");
        s1.unregister(o2);
        System.out.println("Subject1: Setting flag to 10");
        s1.setFlag(10);
        System.out.println("Subject2: Setting flag to 15");
        s2.setFlag(15);
    }
}
