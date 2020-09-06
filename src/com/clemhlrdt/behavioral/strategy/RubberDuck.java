package com.clemhlrdt.behavioral.strategy;

import com.clemhlrdt.behavioral.strategy.behaviors.FlyNoWay;
import com.clemhlrdt.behavioral.strategy.behaviors.QuackSquicky;

public class RubberDuck extends Duck {

	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new QuackSquicky();
	}

	@Override
	public void display() {
		System.out.println("I am a rubber duck");
	}
}
