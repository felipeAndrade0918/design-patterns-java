package com.batuta.design_patterns.factory.factory_method.factory;

import com.batuta.design_patterns.factory.factory_method.product.CoconutPizza;
import com.batuta.design_patterns.factory.factory_method.product.Pizza;

public class CostaRicaPizzaFactory extends PizzaFactory {

	@Override
	protected Pizza getPizza() {
		return new CoconutPizza();
	}

}
