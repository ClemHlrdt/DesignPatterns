package com.clemhlrdt.structural.decorator;

public class Milk extends AddonDecorator {
	public Milk(Beverage wrappee) {
		super(wrappee);
	}

	@Override
	public double cost() {
		return super.cost() + 2;
	}
}
