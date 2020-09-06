package com.clemhlrdt.behavioral.strategy.behaviors;

public class FlyRocketPowered implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("I'm a flying duck with a rocket!");
	}
}
