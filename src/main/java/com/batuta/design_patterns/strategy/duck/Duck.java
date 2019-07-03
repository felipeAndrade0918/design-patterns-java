package com.batuta.design_patterns.strategy.duck;

import com.batuta.design_patterns.strategy.strategy.Fly;

public class Duck {

	private String name;
	
	private Fly flyingAbility;
	
	public Duck(String name, Fly flyingAbility) {
		super();
		this.name = name;
		this.flyingAbility = flyingAbility;
	}
	
	public String getName() {
		return name;
	}

	public String fly() {
		return flyingAbility.fly();
	}

	public void setFlyingAbility(Fly flyingAbility) {
		this.flyingAbility = flyingAbility;
	}
}
