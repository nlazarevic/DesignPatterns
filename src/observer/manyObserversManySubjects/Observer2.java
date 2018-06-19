package observer.manyObserversManySubjects;

public class Observer2 implements ObserverInterface {
    @Override
    public void update(String s, int i) {
        System.out.println("Observer2: flag in " + s +" is now: " + i);
    }
}
