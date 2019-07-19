package com.batuta.design_patterns.factory.factory_method;

import com.batuta.design_patterns.factory.factory_method.factory.CostaRicaPizzaFactory;
import com.batuta.design_patterns.factory.factory_method.factory.PizzaFactory;
import com.batuta.design_patterns.factory.factory_method.factory.UsaPizzaFactory;
import com.batuta.design_patterns.factory.factory_method.product.Pizza;

public class FactoryMethodDemo {

	/**
	 * Define an interface for creating an object, but let subclasses decide which class 
	 * to instantiate. 
	 * <br>
	 * The Factory method lets a class defer instantiation it uses to subclasses.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		PizzaFactory usaPizzaFactory = new UsaPizzaFactory();
		PizzaFactory costaRicaPizzaFactory = new CostaRicaPizzaFactory();
		
		// Each factory will create its own pizza, in addition to baking it
		Pizza usaPizza = usaPizzaFactory.createPizza();
		Pizza costaRicaPizza = costaRicaPizzaFactory.createPizza();
		
		System.out.println(usaPizza);
		System.out.println(costaRicaPizza);
	}
}