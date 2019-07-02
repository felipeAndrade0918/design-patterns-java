package com.batuta.design_patterns.observer.subject;

import java.util.ArrayList;
import java.util.List;

import com.batuta.design_patterns.observer.observer.ActionListener;

public class UiButton implements UiComponent {

	private List<ActionListener> clickActionListeners = new ArrayList<>();
	
	public void addActionListener(ActionListener clickActionListener) {
		clickActionListeners.add(clickActionListener);
	}
	
	public void removeActionListener(ActionListener clickActionListener) {
		clickActionListeners.remove(clickActionListener);
	}
	
	public void notifyAction() {
		clickActionListeners.forEach(ActionListener::onClick);
	}
}
