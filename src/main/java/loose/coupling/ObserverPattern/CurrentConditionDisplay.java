package loose.coupling.ObserverPattern;

import subjects.Subject;

public class CurrentConditionDisplay implements Observer, DisplayElements {

	private float		temperature;
	private float		humidity;
	private float		pressure;
	private Subject	weatherData;

	private String		ff;

	public CurrentConditionDisplay(Subject weatherData) {

		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void display() {
		System.out.println("Current conditions " + temperature + "F degrees "
				+ humidity + "% humidity" + " and pressure is  " + pressure);
	}

	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		this.display();
	}

}
