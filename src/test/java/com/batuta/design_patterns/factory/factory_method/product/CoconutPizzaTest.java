package com.batuta.design_patterns.factory.factory_method.product;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CoconutPizzaTest {

	private Pizza coconutPizza;
	
	@Before
	public void setup() {
		this.coconutPizza = new CoconutPizza();
	}
	
	@Test
	public void should_ReturnCoconutPizza_When_GetNameIsInvoked() {
		// Method call
		String pizzaName = coconutPizza.getName();
		
		// Assertions
		Assert.assertEquals("Coconut Pizza", pizzaName);
	}
	
	@Test
	public void should_ReturnTrue_When_PizzaIsBaked() {
		//Method call
		boolean isInitiallyBaked = coconutPizza.isBaked();
		coconutPizza.bake();
		boolean isBaked = coconutPizza.isBaked();
		
		// Assertions
		Assert.assertFalse(isInitiallyBaked);
		Assert.assertTrue(isBaked);
	}
	
}
