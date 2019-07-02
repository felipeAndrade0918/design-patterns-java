package com.batuta.design_patterns.observer.observer;

public class ClickActionListener implements ActionListener {

	@Override
	public void onClick() {
		System.out.println("Alert! Somebody clicked me!\n");
	}

}
