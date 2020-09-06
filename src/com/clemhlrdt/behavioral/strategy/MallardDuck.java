package com.clemhlrdt.behavioral.strategy;

import com.clemhlrdt.behavioral.strategy.behaviors.FlyWithWings;
import com.clemhlrdt.behavioral.strategy.behaviors.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I'm a real Mallard Duck");
	}
}
