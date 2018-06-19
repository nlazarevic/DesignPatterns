package observer.manyObserversManySubjects;

public interface SubjectInterfaceManyObserersManySubjects {
    void register(ObserverInterface o);
    void unregister(ObserverInterface o);
    void notifyObservers(int i);
}
