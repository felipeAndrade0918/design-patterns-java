package com.batuta.design_patterns.strategy.duck;

import com.batuta.design_patterns.strategy.strategy.CanFly;
import com.batuta.design_patterns.strategy.strategy.Fly;

public class WildDuck extends Duck {

	public WildDuck() {
		super(new CanFly());
	}

	public void setFlightAbility(Fly flightAbility) {
		this.flyingAbility = flightAbility;
	}

	public void printName() {
		System.out.println("I am a wild duck.");
	}

	public void fly() {
		flyingAbility.fly();
	}

}
