package com.shiven.designpatterns.observer;

public class CurrentConditionDisplay implements Observer,Display{
	
	private float temp;
	private float humidity;
	private WeatherData weatherData;
	
	public CurrentConditionDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		
		System.out.println("Current conditions : temp"+ temp+" and humidity"+ humidity);
		
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		display();
	}

}
