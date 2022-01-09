package effective.java.com.patterns.observer;

import effective.java.com.patterns.observer.observable.WeatherStation;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PhoneDisplay implements Observer {
    private final WeatherStation weatherStation;
    private double temperature;

    @Override
    public void update() {
        this.temperature = weatherStation.getTemperature();
    }

    public double getTemperature() {
        return this.temperature;
    }
}
