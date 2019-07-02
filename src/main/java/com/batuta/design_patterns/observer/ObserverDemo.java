package com.batuta.design_patterns.observer;

import com.batuta.design_patterns.observer.observer.ClickActionListener;
import com.batuta.design_patterns.observer.observer.ActionListener;
import com.batuta.design_patterns.observer.subject.UiButton;
import com.batuta.design_patterns.observer.subject.UiComponent;

public class ObserverDemo {

	/**
	 * The observer pattern defines a one-to-many relationship where an object (subject)
	 * keeps other objects (observers) updated about its state.
	 * <br>
	 * In this example, an {@link UiComponent} can have many {@link ActionListener}
	 * updated about its state when an action happens.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		UiButton uiButton = new UiButton();
		ActionListener alertClickActionListener = new ClickActionListener();
		
		uiButton.addActionListener(alertClickActionListener);
		
		System.out.println("###### Notifying a single observer ######");
		
		uiButton.notifyAction();
		
		uiButton.addActionListener(() -> System.out.println("I'm an anonymous listener! Somebody clicked me!\n"));
		
		System.out.println("###### Notifying two observers ######");
		
		uiButton.notifyAction();
		
		uiButton.removeActionListener(alertClickActionListener);
		
		System.out.println("###### Notifying only one observer once again ######");
		
		uiButton.notifyAction();
	}
}
