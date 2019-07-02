package com.batuta.design_patterns.strategy.duck;

import com.batuta.design_patterns.strategy.strategy.Fly;

public abstract class Duck {

	protected Fly flyingAbility;
	
	public Duck(Fly flyingAbility) {
		super();
		this.flyingAbility = flyingAbility;
	}

	public abstract void printName();
	
	public abstract void fly();
	
	public void setFlyingAbility(Fly flyingAbility) {
		this.flyingAbility = flyingAbility;
	}
}
