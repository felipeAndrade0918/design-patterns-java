package com.batuta.design_patterns.decorator.decorator;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.batuta.design_patterns.decorator.component.Beverage;

public class HoneyDecoratorTest {

	private Beverage honeyDecorator;
	
	@Before
	public void setup() {
		Beverage beverageMock = Mockito.mock(Beverage.class);
		
		Mockito.when(beverageMock.getDescription()).thenReturn("Mock beverage");
		Mockito.when(beverageMock.getCost()).thenReturn(BigDecimal.valueOf(2));
		
		this.honeyDecorator = new HoneyDecorator(beverageMock);
	}
	
	@Test
	public void should_ReturnBothBeverageAndCondimentDescription_When_DescriptionMethodIsInvoked() {
		// Method call
		String description = honeyDecorator.getDescription();
		
		// Assertions
		Assert.assertEquals("Mock beverage, with honey", description);
	}
	
	@Test
	public void should_ReturnTheFinalCostOfTheBeverageAndCondiment_When_CostMethodIsInvoked() {
		// Method call
		BigDecimal cost = honeyDecorator.getCost();
		
		// Assertions
		Assert.assertEquals(BigDecimal.valueOf(5.5), cost);
	}

}
