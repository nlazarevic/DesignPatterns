package observer.manyObserversManySubjects;

import observer.Observer;
import observer.SubjectInterface;

import java.util.ArrayList;
import java.util.List;

public class Subject2 implements SubjectInterfaceManyObserersManySubjects{
    List<ObserverInterface> observerList = new ArrayList<>();
    private int flag;

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
        notifyObservers(flag);
    }

    @Override
    public void register(ObserverInterface o) {
        observerList.add(o);
    }

    @Override
    public void unregister(ObserverInterface o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers(int i) {
        observerList.stream().forEach(o -> o.update(this.getClass().getSimpleName(), i));
    }
}
