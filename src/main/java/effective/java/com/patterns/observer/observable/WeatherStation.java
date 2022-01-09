package effective.java.com.patterns.observer.observable;

import effective.java.com.patterns.observer.Observer;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class WeatherStation implements Observable {
    private List<Observer> observers = new ArrayList<>();
    @Setter
    private double temperature = 0.0d;

    @Override
    public void add(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.removeIf(existingObserver -> existingObserver.equals(observer));
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }
}
