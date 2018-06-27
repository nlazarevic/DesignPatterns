package memento;

public class Caretaker {
    private Memento _memento;

    public void saveMemento(Memento m){
        _memento = m;
    }

    public Memento retrieveMemento(){
        return _memento;
    }
}
