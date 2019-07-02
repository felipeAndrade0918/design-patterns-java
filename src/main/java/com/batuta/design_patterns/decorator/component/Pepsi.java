package com.batuta.design_patterns.decorator.component;

import java.math.BigDecimal;

public class Pepsi implements Beverage {

	public String getDescription() {
		return "Pepsi";
	}

	public BigDecimal getCost() {
		return BigDecimal.valueOf(2.5);
	}

}
