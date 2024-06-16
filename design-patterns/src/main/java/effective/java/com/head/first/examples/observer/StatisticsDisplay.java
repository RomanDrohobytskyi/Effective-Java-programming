package effective.java.com.head.first.examples.observer;

import effective.java.com.head.first.examples.observer.observable.Observable;


public class StatisticsDisplay implements Observer, DisplayElement {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;
	private Observable weatherData;

	public StatisticsDisplay(Observable weatherData) {
		this.weatherData = weatherData;
		weatherData.addObserver(this);
	}

	public void update(float temp, float humidity, float pressure) {
		tempSum += temp;
		numReadings++;

		if (temp > maxTemp) {
			maxTemp = temp;
		}

		if (temp < minTemp) {
			minTemp = temp;
		}

		display();
	}

	public String display() {
		return "Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp;
	}
}
