package effective.java.com.patterns.observer.observable;

import effective.java.com.patterns.observer.Observer;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
