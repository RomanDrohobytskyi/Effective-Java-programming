package head.first.examples.strategy;

import effective.java.com.head.first.examples.observer.CurrentConditionsDisplay;
import effective.java.com.head.first.examples.observer.ForecastDisplay;
import effective.java.com.head.first.examples.observer.HeatIndexDisplay;
import effective.java.com.head.first.examples.observer.observable.WeatherData;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ObserverTest {
    private WeatherData weatherData;

    @BeforeEach
    public void init() {
         this.weatherData = new WeatherData();
    }

    @Test
    void shouldAddObserver() {
        // when
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        // then
        assertThat(weatherData.getObservers()).isNotEmpty();
        assertThat(weatherData.getObservers()).hasSize(3);
        assertThat(weatherData.getObservers()).contains(currentConditionsDisplay);
        assertThat(weatherData.getObservers()).contains(forecastDisplay);
        assertThat(weatherData.getObservers()).contains(heatIndexDisplay);
    }

    @Test
    void shouldRemoveObserver() {
        // given
        CurrentConditionsDisplay observerToBeRemoved = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        // when
        weatherData.removeObserver(observerToBeRemoved);

        // then
        assertThat(weatherData.getObservers()).isNotEmpty();
        assertThat(weatherData.getObservers()).hasSize(1);
        assertThat(weatherData.getObservers()).contains(forecastDisplay);
        assertThat(weatherData.getObservers()).doesNotContain(observerToBeRemoved);
    }

    @Test
    void currentConditionsDisplayTest() {
        // given
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 70, 30);

        // when
        String displayResult = currentConditionsDisplay.display();

        // then
        String expectedDisplayResult = "Current conditions: 80.0F degrees and 70.0% humidity";
        assertThat(displayResult).isEqualTo(expectedDisplayResult);
    }

    @Test
    void forecastDisplayTest() {
        // given
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(80, 70, 30);

        // when
        String displayResult = forecastDisplay.display();

        // then
        String expectedDisplayResult = "Forecast: Improving weather on the way!";
        assertThat(displayResult).isEqualTo(expectedDisplayResult);
    }

}
