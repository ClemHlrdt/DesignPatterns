package com.clemhlrdt.behavioral.strategy.behaviors;

public class FlyWithWings implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("flap flap flap");
	}
}
