package com.batuta.design_patterns.decorator.decorator;

import java.math.BigDecimal;

import com.batuta.design_patterns.decorator.component.Beverage;

public class HoneyDecorator implements CondimentDecorator {

	private Beverage beverage;
	
	public HoneyDecorator(Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", with honey";
	}

	public BigDecimal getCost() {
		return beverage.getCost().add(BigDecimal.valueOf(3.5));
	}

}
