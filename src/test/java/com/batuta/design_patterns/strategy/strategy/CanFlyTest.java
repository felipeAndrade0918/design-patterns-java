package com.batuta.design_patterns.strategy.strategy;

import org.junit.Assert;
import org.junit.Test;

public class CanFlyTest {

	@Test
	public void should_ReturnFlightResult_When_FlyMethodIsInvoked() {
		// Mocks
		Fly canFly = new CanFly();
		
		// Method call
		String flightResult = canFly.fly();
		
		// Assertions
		Assert.assertNotNull(flightResult);
		Assert.assertEquals("I can fly really high!", flightResult);
	}

}
