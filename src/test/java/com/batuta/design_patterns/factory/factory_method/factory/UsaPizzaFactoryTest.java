package com.batuta.design_patterns.factory.factory_method.factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.batuta.design_patterns.factory.factory_method.product.DoubleCheesePizza;
import com.batuta.design_patterns.factory.factory_method.product.Pizza;

public class UsaPizzaFactoryTest {

	private PizzaFactory usaPizzaFactory;
	
	@Before
	public void setup() {
		this.usaPizzaFactory = new UsaPizzaFactory();
	}
	
	@Test
	public void should_ReturnBakedDoubleCheesePizza_When_CreatePizzaIsInvoked() {
		// Method call
		Pizza usaPizza = usaPizzaFactory.createPizza();
		
		// Assertions
		Assert.assertNotNull(usaPizza);
		Assert.assertTrue(usaPizza instanceof DoubleCheesePizza);
		Assert.assertTrue(usaPizza.isBaked());
	}

}
