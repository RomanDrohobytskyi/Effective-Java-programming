package effective.java.com.head.first.examples.observer.observable;

import effective.java.com.head.first.examples.observer.Observer;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
