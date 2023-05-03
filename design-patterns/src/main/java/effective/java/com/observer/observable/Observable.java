package effective.java.com.observer.observable;

import effective.java.com.observer.Observer;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
