package com.batuta.design_patterns.decorator.decorator;

import java.math.BigDecimal;

import com.batuta.design_patterns.decorator.component.Beverage;

public class SugarDecorator implements CondimentDecorator {

	private Beverage beverage;
	
	public SugarDecorator(Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", with sugar";
	}

	public BigDecimal getCost() {
		return beverage.getCost().add(BigDecimal.valueOf(1));
	}

}
