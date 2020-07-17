package com.clemhlrdt.strategy;

public class FlyWithWings implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("flap flap flap");
	}
}
