package com.batuta.design_patterns.observer.subject;

import com.batuta.design_patterns.observer.observer.ActionListener;

public interface UiComponent {

	void addActionListener(ActionListener actionListener);
	
	void removeActionListener(ActionListener actionListener);
	
	void notifyAction();
}
