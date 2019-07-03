package com.batuta.design_patterns.strategy.strategy;

import org.junit.Assert;
import org.junit.Test;

public class CantFlyTest {

	@Test
	public void should_ReturnFlightResult_When_FlyMethodIsInvoked() {
		// Mocks
		Fly canFly = new CantFly();
		
		// Method call
		String flightResult = canFly.fly();
		
		// Assertions
		Assert.assertNotNull(flightResult);
		Assert.assertEquals("I can't really fly...", flightResult);
	}

}
