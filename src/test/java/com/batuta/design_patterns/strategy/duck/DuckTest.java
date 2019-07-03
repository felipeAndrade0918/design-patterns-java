package com.batuta.design_patterns.strategy.duck;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import com.batuta.design_patterns.strategy.duck.Duck;
import com.batuta.design_patterns.strategy.strategy.CantFly;
import com.batuta.design_patterns.strategy.strategy.Fly;

public class DuckTest {

	@Test
	public void should_UseGivenFlyAbility_When_DuckHasFlyAbility() {
		// Mocks
		Fly flyMock = Mockito.mock(Fly.class);
		Mockito.when(flyMock.fly()).thenReturn("I can fly!?");
		
		Duck duck = new Duck("Wild Duck", flyMock);
		
		// Method call
		String duckName = duck.getName();
		String flightResult = duck.fly();
		
		// Assertions
		Assert.assertNotNull(duckName);
		Assert.assertNotNull(flightResult);
		
		Assert.assertEquals("Wild Duck", duckName);
		Assert.assertEquals("I can fly!?", flightResult);
	}
	
	@Test
	public void should_SwitchGivenFlyAbility_When_DuckHasNewFlyAbility() {
		// Mocks
		Fly flyMock = Mockito.mock(Fly.class);
		
		Fly newFlyMock = Mockito.mock(Fly.class);
		Mockito.when(newFlyMock.fly()).thenReturn("I am a new fly ability!");
		
		Duck duck = new Duck("Wild Duck", flyMock);
		duck.setFlyingAbility(newFlyMock);
		
		// Method call
		String duckName = duck.getName();
		String flightResult = duck.fly();
		
		// Assertions
		Assert.assertNotNull(duckName);
		Assert.assertNotNull(flightResult);
		
		Assert.assertEquals("Wild Duck", duckName);
		Assert.assertEquals("I am a new fly ability!", flightResult);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void should_ThrowIllegalArgumentException_When_NameParameterIsNull() {
		new Duck(null, new CantFly());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void should_ThrowIllegalArgumentException_When_FlyParameterIsNull() {
		new Duck("Rubber Duck", null);
	}

}
