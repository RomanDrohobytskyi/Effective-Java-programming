package effective.java.com.patterns.observer;

import effective.java.com.patterns.observer.observable.WeatherData;

public class HeatIndexDisplay implements Observer, DisplayElement {
    private final WeatherData weatherStation;
    private float heatIndex = 0.0f;

    public HeatIndexDisplay(WeatherData weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        heatIndex = temperature;
        display();
    }

    @Override
    public String display() {
        return "Heat index will in process... Temperature is " + heatIndex;
    }
}
