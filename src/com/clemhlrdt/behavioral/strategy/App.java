package com.clemhlrdt.behavioral.strategy;

import com.clemhlrdt.behavioral.strategy.behaviors.FlyRocketPowered;

public class App {
	public static void main(String[] args) {
		MallardDuck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.performFly();
		mallardDuck.performQuack();

		System.out.println("##########################");

		Duck model = new ModelDuck();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();

		System.out.println("##########################");

		Duck rubberDuck = new RubberDuck();
		rubberDuck.display();
		rubberDuck.performFly();
		rubberDuck.performQuack();
	}
}
