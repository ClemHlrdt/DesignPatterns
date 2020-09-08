package com.clemhlrdt.structural.decorator;

public class Caramel extends AddonDecorator {

	Beverage beverage;

	public Caramel(Beverage b) {
		this.beverage = b;
	}

	@Override
	public double cost() {
		return this.beverage.cost() + 2;
	}
}
