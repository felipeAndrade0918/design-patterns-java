package com.batuta.design_patterns.factory.factory_method.factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.batuta.design_patterns.factory.factory_method.product.CoconutPizza;
import com.batuta.design_patterns.factory.factory_method.product.Pizza;

public class CostaRicaPizzaFactoryTest {

	private PizzaFactory costaRicaPizzaFactory;
	
	@Before
	public void setup() {
		this.costaRicaPizzaFactory = new CostaRicaPizzaFactory();
	}
	
	@Test
	public void should_ReturnBakedCostaRicaPizza_When_CreatePizzaIsInvoked() {
		// Method call
		Pizza costaRicaPizza = costaRicaPizzaFactory.createPizza();
		
		// Assertions
		Assert.assertNotNull(costaRicaPizza);
		Assert.assertTrue(costaRicaPizza instanceof CoconutPizza);
		Assert.assertTrue(costaRicaPizza.isBaked());
	}

}
