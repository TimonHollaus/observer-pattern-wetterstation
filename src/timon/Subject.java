package timon;

import java.util.*;

public abstract class Subject {

    private List<timon.Observer> observers;

    public Subject() {
        observers = new ArrayList<timon.Observer>();
    }

    public void attach(timon.Observer observer){
        this.observers.add(observer);
    }
    public void detach(timon.Observer observer){
        this.observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer o : observers){
            o.update();
        }
    }
}
