package com.clemhlrdt.behavioral.observer;

public class App {
	public static void main(String[] args) {
		WeatherStation station = new WeatherStation();

		PhoneDisplay display = new PhoneDisplay(station);
		PhoneDisplay display2 = new PhoneDisplay(station);

		station.add(display);
		station.add(display2);

		station.remove(display2);

		station.doNotify();
		station.setTemp(13);
		station.setTemp(12);

		station.add(display2);
		station.setTemp(20);

		display2.update();
	}
}
