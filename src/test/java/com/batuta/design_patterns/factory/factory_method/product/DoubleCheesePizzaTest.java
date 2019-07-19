package com.batuta.design_patterns.factory.factory_method.product;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DoubleCheesePizzaTest {

	private Pizza doubleCheesePizza;
	
	@Before
	public void setup() {
		this.doubleCheesePizza = new DoubleCheesePizza();
	}
	
	@Test
	public void should_ReturnDoubleCheesePizza_When_GetNameIsInvoked() {
		// Method call
		String pizzaName = doubleCheesePizza.getName();
		
		// Assertions
		Assert.assertEquals("Double Cheese Pizza", pizzaName);
	}
	
	@Test
	public void should_ReturnTrue_When_PizzaIsBaked() {
		//Method call
		boolean isInitiallyBaked = doubleCheesePizza.isBaked();
		doubleCheesePizza.bake();
		boolean isBaked = doubleCheesePizza.isBaked();
		
		// Assertions
		Assert.assertFalse(isInitiallyBaked);
		Assert.assertTrue(isBaked);
	}

}
