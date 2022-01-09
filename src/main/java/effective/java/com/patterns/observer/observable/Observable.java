package effective.java.com.patterns.observer.observable;

import effective.java.com.patterns.observer.Observer;

public interface Observable {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyObservers();
}
