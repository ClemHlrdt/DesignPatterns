package com.clemhlrdt.strategy;

import java.util.ArrayList;
import java.util.List;

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
