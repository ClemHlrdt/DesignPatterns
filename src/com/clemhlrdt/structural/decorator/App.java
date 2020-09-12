package com.clemhlrdt.structural.decorator;

public class App {
	public static void main(String[] args) {

		Beverage espresso = new Espresso();
		espresso = new Caramel(espresso);
		espresso = new Caramel(espresso);
		espresso = new Milk(espresso);

		System.out.println(espresso.cost());
	}
}
