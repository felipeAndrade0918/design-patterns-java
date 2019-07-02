package com.batuta.design_patterns.strategy.duck;

import com.batuta.design_patterns.strategy.strategy.CantFly;

public class RubberDuck extends Duck {

	public RubberDuck() {
		super(new CantFly());
	}

	@Override
	public void printName() {
		System.out.println("I am a rubber duck");
	}

	@Override
	public void fly() {
		flyingAbility.fly();
	}

}
