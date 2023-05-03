package effective.java.com.observer;

import effective.java.com.observer.observable.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private final WeatherData weatherStation;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(WeatherData weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);
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
