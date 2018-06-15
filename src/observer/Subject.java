package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject implements SubjectInterface{
    List<Observer> observerList = new ArrayList<Observer>();
    private int flag;

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
        notifyObservers();
    }

    @Override
    public void register(Observer o) {
        observerList.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (int i=0; i < observerList.size(); i++){
            observerList.get(i).update();
        }
    }
}
