package com.batuta.design_patterns.observer.subject;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.batuta.design_patterns.observer.observer.ActionListener;

public class UiButtonTest {

	private UiComponent uiButton;

	@Before
	public void before() {
		this.uiButton = new UiButton();
	}
	
	@Test
	public void should_AddOneObserver_When_ItImplementsTheCorrectInterface() {
		// Mocks
		ActionListener actionListenerMock = Mockito.mock(ActionListener.class);
		
		// Method call
		uiButton.addActionListener(actionListenerMock);
		
		// Assertions
		Assert.assertEquals(1, uiButton.getActionListenersSize());
	}
	
	@Test
	public void should_AddMultipleObservers_When_TheyImplementTheCorrectInterface() {
		// Mocks
		ActionListener actionListenerMock = Mockito.mock(ActionListener.class);
		ActionListener actionListenerMock2 = Mockito.mock(ActionListener.class);
		
		// Method call
		uiButton.addActionListener(actionListenerMock);
		uiButton.addActionListener(actionListenerMock2);
		
		// Assertions
		Assert.assertEquals(2, uiButton.getActionListenersSize());
	}
	
	@Test
	public void should_RemoveObserver_When_PassingTheSameObject() {
		// Mocks
		ActionListener actionListenerMock = Mockito.mock(ActionListener.class);
		
		// Method call
		uiButton.addActionListener(actionListenerMock);
		uiButton.removeActionListener(actionListenerMock);
		
		// Assertions
		Assert.assertEquals(0, uiButton.getActionListenersSize());
	}
	
	@Test
	public void should_NotifyEachObserver_When_TheyImplementTheCorrectInterface() {
		// Mocks
		ActionListener actionListenerMock = Mockito.mock(ActionListener.class);
		ActionListener actionListenerMock2 = Mockito.mock(ActionListener.class);
		
		// Method call
		uiButton.addActionListener(actionListenerMock);
		uiButton.addActionListener(actionListenerMock2);
		uiButton.notifyAction();
		
		// Assertions
		Assert.assertEquals(2, uiButton.getActionListenersSize());
		
		Mockito.verify(actionListenerMock).onClick();
		Mockito.verify(actionListenerMock2).onClick();
	}

}
