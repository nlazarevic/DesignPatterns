package observer;

public interface SubjectInterface {
    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers();
}
