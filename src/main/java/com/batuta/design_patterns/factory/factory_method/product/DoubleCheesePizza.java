package com.batuta.design_patterns.factory.factory_method.product;

public class DoubleCheesePizza implements Pizza {

	private boolean baked;
	
	@Override
	public String getName() {
		return "Double Cheese Pizza";
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
		return "DoubleCheesePizza [getName()=" + getName() + ", isBaked()=" + isBaked() + "]";
	}
	
}
