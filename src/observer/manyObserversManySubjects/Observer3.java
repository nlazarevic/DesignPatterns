package observer.manyObserversManySubjects;

public class Observer3 implements ObserverInterface {
    @Override
    public void update(String s, int i) {
        System.out.println("Observer3: flag in " + s +" is now: " + i);
    }
}
