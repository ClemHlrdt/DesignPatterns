package com.clemhlrdt.behavioral.strategy;

import com.clemhlrdt.behavioral.strategy.behaviors.FlyNoWay;
import com.clemhlrdt.behavioral.strategy.behaviors.Quack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I am a model duck");
	}
}
