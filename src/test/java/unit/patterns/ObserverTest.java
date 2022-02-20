package unit.patterns;

import effective.java.com.patterns.observer.CurrentConditionsDisplay;
import effective.java.com.patterns.observer.ForecastDisplay;
import effective.java.com.patterns.observer.HeatIndexDisplay;
import effective.java.com.patterns.observer.observable.WeatherData;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        assertEquals(3, weatherData.getObservers().size());
        assertTrue(weatherData.getObservers().contains(currentConditionsDisplay));
        assertTrue(weatherData.getObservers().contains(forecastDisplay));
        assertTrue(weatherData.getObservers().contains(heatIndexDisplay));
    }

    @Test
    void shouldRemoveObserver() {
        // given
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        // when
        weatherData.removeObserver(currentConditionsDisplay);

        // then
        assertEquals(1, weatherData.getObservers().size());
        assertFalse(weatherData.getObservers().contains(currentConditionsDisplay));
        assertTrue(weatherData.getObservers().contains(forecastDisplay));
    }

    @Test
    void CurrentConditionsDisplayTest() {
        // given
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 70, 30);

        // when
        String displayResult = currentConditionsDisplay.display();

        // then
        String expectedDisplayResult = "Current conditions: 80.0F degrees and 70.0% humidity";
        assertEquals(expectedDisplayResult, displayResult);
    }

    @Test
    void ForecastDisplayTest() {
        // given
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(80, 70, 30);

        // when
        String displayResult = forecastDisplay.display();

        // then
        String expectedDisplayResult = "Forecast: Improving weather on the way!";
        assertEquals(expectedDisplayResult, displayResult);
    }

}
