package unit.patterns;

import effective.java.com.patterns.observer.PhoneDisplay;
import effective.java.com.patterns.observer.observable.WeatherStation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ObserverTest {
    private WeatherStation weatherStation;

    @BeforeEach
    public void init() {
         this.weatherStation = new WeatherStation();
    }

    @Test
    void shouldAddObserver() {
        // given
        PhoneDisplay phoneDisplay = new PhoneDisplay(weatherStation);

        // when
        weatherStation.add(phoneDisplay);

        // then
        assertEquals(1, weatherStation.getObservers().size());
       assertTrue(weatherStation.getObservers().contains(phoneDisplay));
    }

    @Test
    void shouldRemoveObserver() {
        // given
        PhoneDisplay phoneDisplay = new PhoneDisplay(weatherStation);
        weatherStation.add(phoneDisplay);

        // when
        weatherStation.remove(phoneDisplay);

        // then
        assertEquals(0, weatherStation.getObservers().size());
        assertFalse(weatherStation.getObservers().contains(phoneDisplay));
    }

    @Test
    void shouldBeDefaultTemperature() {
        // given
        double defaultTemperature = 0.0d;
        PhoneDisplay phoneDisplay = new PhoneDisplay(weatherStation);
        weatherStation.add(phoneDisplay);

        // when
        weatherStation.notifyObservers();
        double actualTemperature = phoneDisplay.getTemperature();

        // then
       assertEquals(defaultTemperature, actualTemperature);
    }

    @Test
    void shouldBeSameTemperature() {
        // given
        double temperature = 26.5d;
        PhoneDisplay phoneDisplay = new PhoneDisplay(weatherStation);
        weatherStation.setTemperature(temperature);
        weatherStation.add(phoneDisplay);

        // when
        weatherStation.notifyObservers();
        double actualTemperature = phoneDisplay.getTemperature();

        // then
       assertEquals(temperature, actualTemperature);
    }
}
