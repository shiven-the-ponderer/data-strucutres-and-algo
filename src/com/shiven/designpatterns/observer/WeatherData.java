package com.shiven.designpatterns.observer;

import java.util.ArrayList;

public class WeatherData implements Subject{

	public ArrayList<Observer>  observers;
	private float temp;
	private float humidity;
	private float pressure;
	
	
	public  WeatherData() {
		//we have created an array list to hold the list of observers.
		observers = new ArrayList<>();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observers.indexOf(observer));
	}

	@Override
	public void notifyObservers() {
		for(Observer observer : observers) {
			//all the observers will implement update method from Observer interface. 
			observer.update(temp, humidity, pressure);
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	//how to call setMeasurements method , maybe from main but confusion is there
	public void setMeasurements(float temp,float humidity,float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
