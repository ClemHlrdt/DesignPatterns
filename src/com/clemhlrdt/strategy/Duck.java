package com.clemhlrdt.strategy;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public void performQuack(){
		quackBehavior.quack();
	}

	public void display(){

	}

	public void performFly(){
		flyBehavior.fly();
	}

	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
}
