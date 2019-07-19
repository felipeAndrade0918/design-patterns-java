package com.batuta.design_patterns.factory.factory_method.factory;

import com.batuta.design_patterns.factory.factory_method.product.DoubleCheesePizza;
import com.batuta.design_patterns.factory.factory_method.product.Pizza;

public class UsaPizzaFactory extends PizzaFactory {

	@Override
	protected Pizza getPizza() {
		return new DoubleCheesePizza();
	}

}