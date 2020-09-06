package com.clemhlrdt.behavioral.observer;

public class PhoneDisplay implements Observer, Display {

	WeatherStation station;
	double currentTemp;

	public PhoneDisplay(WeatherStation station) {
		this.station = station;
	}

	@Override
	public void update() {
		currentTemp = this.station.getTemperature();
		System.out.println("Current temperature is: " + currentTemp + "°c.\n");
	}

	@Override
	public void display() {
		System.out.println(currentTemp);
	}
}
