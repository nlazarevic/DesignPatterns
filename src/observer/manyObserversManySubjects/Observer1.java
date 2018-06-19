package observer.manyObserversManySubjects;

public class Observer1 implements ObserverInterface {
    @Override
    public void update(String s, int i) {
        System.out.println("Observer1: flag in " + s +" is now: " + i);
    }
}
