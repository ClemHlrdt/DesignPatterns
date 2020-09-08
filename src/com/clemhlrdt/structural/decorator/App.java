package com.clemhlrdt.structural.decorator;

public class App {
	public static void main(String[] args) {

		Espresso espresso = new Espresso();
		Caramel caramel1 = new Caramel(espresso);
		Caramel caramel2 = new Caramel(caramel1);

		System.out.println(caramel2.cost());
	}
}
