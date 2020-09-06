package com.clemhlrdt.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable {

	double temp = 12.5;

	List<Observer> observerList = new ArrayList<>();

	@Override
	public void add(Observer observer) {
		observerList.add(observer);
	}

	@Override
	public void remove(Observer observer) {
		observerList.remove(observer);
	}

	@Override
	public void doNotify() {
		for (Observer obs : observerList){
			obs.update();
		}
	}

	public double getTemperature(){
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
		this.doNotify();
	}
}
