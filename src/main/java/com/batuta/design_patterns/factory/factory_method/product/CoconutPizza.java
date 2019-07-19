package com.batuta.design_patterns.factory.factory_method.product;

public class CoconutPizza implements Pizza {

	private boolean baked;
	
	@Override
	public String getName() {
		return "Coconut Pizza";
	}

	@Override
	public boolean isBaked() {
		return baked;
	}

	@Override
	public void bake() {
		this.baked = true;
	}

	@Override
	public String toString() {
		return "CoconutPizza [getName()=" + getName() + ", isBaked()=" + isBaked() + "]";
	}
	
}
