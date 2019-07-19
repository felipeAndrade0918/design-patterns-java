package com.batuta.design_patterns.factory.factory_method.factory;

import com.batuta.design_patterns.factory.factory_method.product.Pizza;

public abstract class PizzaFactory {

	protected abstract Pizza getPizza();
	
	public Pizza createPizza() {
		Pizza pizza = getPizza();
		
		pizza.bake();
		
		return pizza;
	}
	
}
