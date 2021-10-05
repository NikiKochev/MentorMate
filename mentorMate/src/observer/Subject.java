package observer;

import java.util.List;

public class Subject implements ISubject{

    List<IObserver> observers;


    @Override
    public void subscribe(IObserver o) {
        if(!observers.contains(o)) {
            observers.add(o);
        }
    }

    @Override
    public void unsubscribe(IObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyAllObservers(Event e) {
        observers.forEach(o-> o.react(e));
    }
}
