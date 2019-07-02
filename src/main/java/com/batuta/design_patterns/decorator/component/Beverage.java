package com.batuta.design_patterns.decorator.component;

import java.math.BigDecimal;

public interface Beverage {

	String getDescription();
	
	BigDecimal getCost();
	
	default void printInfo() {
		System.out.println(String.format("%s, costs %s reais", getDescription(), getCost()));
		System.out.println();
	}
}
