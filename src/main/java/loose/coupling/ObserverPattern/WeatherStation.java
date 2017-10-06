package loose.coupling.ObserverPattern;

import subjects.WeatherData;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(
				weatherData);

		weatherData.setMeasurements(80f, 65f, 30.4f);
		weatherData.setMeasurements(20f, 55f, 56.64f);

	}

}
