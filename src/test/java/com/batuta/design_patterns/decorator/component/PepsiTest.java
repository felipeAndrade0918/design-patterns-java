package com.batuta.design_patterns.decorator.component;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PepsiTest {

private Beverage beverage;
	
	@Before
	public void setup() {
		this.beverage = new Pepsi();
	}
	
	@Test
	public void should_ReturnTheCorrectDescription_When_DescriptionMethodIsInvoked() {
		// Method call
		String description = beverage.getDescription();
		
		// Assertions
		Assert.assertEquals("Pepsi", description);
	}
	
	@Test
	public void should_ReturnTheCorrectCost_When_CostMethodIsInvoked() {
		// Method call
		BigDecimal cost = beverage.getCost();
		
		// Assertions
		Assert.assertEquals(BigDecimal.valueOf(2.5), cost);
	}

}
