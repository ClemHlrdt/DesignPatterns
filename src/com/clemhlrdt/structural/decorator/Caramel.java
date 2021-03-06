package com.clemhlrdt.structural.decorator;

public class Caramel extends AddonDecorator {

	public Caramel(Beverage wrappee) {
		super(wrappee);
	}

	@Override
	public double cost() {
		return super.cost() + 2;
	}
}
