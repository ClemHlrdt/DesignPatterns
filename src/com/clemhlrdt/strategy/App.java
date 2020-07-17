package com.clemhlrdt.strategy;

public class App {
	public static void main(String[] args) {
		MallardDuck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.performFly();
		mallardDuck.performQuack();

		Duck model = new ModelDuck();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
