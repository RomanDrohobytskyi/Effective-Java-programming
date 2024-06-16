package effective.java.com.head.first.examples.observer;


import effective.java.com.head.first.examples.observer.observable.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {
    private final WeatherData weatherData;
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        updatePressure(pressure);
        display();
    }

    private void updatePressure(float pressure) {
        this.lastPressure = currentPressure;
        this.currentPressure = pressure;
    }

    @Override
    public String display() {
        if (currentPressure > lastPressure) {
            return"Forecast: Improving weather on the way!";
        } else if (currentPressure == lastPressure) {
            return"Forecast: More of the same";
        } else {
            return"Forecast: Watch out for cooler, rainy weather";
        }
    }
}
