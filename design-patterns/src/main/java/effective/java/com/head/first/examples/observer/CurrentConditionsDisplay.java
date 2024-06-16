package effective.java.com.head.first.examples.observer;

import effective.java.com.head.first.examples.observer.observable.Observable;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private final Observable weatherStation;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable weatherData) {
        this.weatherStation = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public String display() {
        return  "Current conditions: " + temperature + "F degrees and " + humidity + "% humidity";
    }
}
