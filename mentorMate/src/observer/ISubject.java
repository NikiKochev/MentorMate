package observer;


public interface ISubject {

    //All subject that implements this interface
    // must have and
    // a list whit IObservers

    void subscribe(IObserver o);

    void unsubscribe(IObserver o);

    void notifyAllObservers(Event e);
}
