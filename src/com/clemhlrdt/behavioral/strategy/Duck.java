package com.clemhlrdt.behavioral.strategy;

import com.clemhlrdt.behavioral.strategy.behaviors.FlyBehavior;
import com.clemhlrdt.behavioral.strategy.behaviors.Quack;
import com.clemhlrdt.behavioral.strategy.behaviors.QuackBehavior;

public abstract class Duck {

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public void performQuack() {
		quackBehavior.quack();
	}

	public void display() {

	}

	public void performFly() {
		flyBehavior.fly();
	}

	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}

	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}

	public void setQuackBehavior(Quack qb){
		quackBehavior = qb;
	}
}
