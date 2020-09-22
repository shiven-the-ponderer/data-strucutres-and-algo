package com.shiven.designpatterns.observer;

public class ObserverMain {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay conditionDisplay = new CurrentConditionDisplay(weatherData);
		weatherData.setMeasurements(21f, 89f, 1.0f);
		weatherData.measurementsChanged();
	}
}
