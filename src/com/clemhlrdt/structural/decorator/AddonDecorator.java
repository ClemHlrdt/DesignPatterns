package com.clemhlrdt.structural.decorator;

public abstract class AddonDecorator implements Beverage {

	protected Beverage wrappee;

	public AddonDecorator(Beverage wrappee) {
		this.wrappee = wrappee;
	}

	@Override
	public double cost() {
		return wrappee.cost();
	}
}
