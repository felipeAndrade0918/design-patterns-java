package com.batuta.design_patterns.decorator.component;

import java.math.BigDecimal;

public class Dollynho implements Beverage {

	public String getDescription() {
		return "Dollynho, seu amiguinho";
	}

	public BigDecimal getCost() {
		return BigDecimal.valueOf(0.5);
	}

}
