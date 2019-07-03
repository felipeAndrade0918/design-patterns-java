package com.batuta.design_patterns.strategy.strategy;

public class CantFly implements Fly {

	@Override
	public String fly() {
		return "I can't really fly...";
	}

}
