package com.batuta.design_patterns.decorator;

import com.batuta.design_patterns.decorator.component.Beverage;
import com.batuta.design_patterns.decorator.component.Dollynho;
import com.batuta.design_patterns.decorator.component.Pepsi;
import com.batuta.design_patterns.decorator.decorator.HoneyDecorator;
import com.batuta.design_patterns.decorator.decorator.SugarDecorator;

public class DecoratorDemo {

	/**
	 * Use the decorator pattern when you want to add
	 * additional behaviours at runtime.
	 * <br>
	 * You begin with a component like {@link Pepsi Pepsi} and add
	 * additional behaviours through the decorators like {@link HoneyDecorator HoneyDecorator}.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Beverage pepsi = new Pepsi();
		Beverage dollynho = new Dollynho();
		
		// Base costs
		pepsi.printInfo();
		dollynho.printInfo();
		
		// Costs with condiments
		Beverage pepsiWithSugar = new SugarDecorator(pepsi);
		pepsiWithSugar.printInfo();
		
		Beverage dollynhoWithHoney = new HoneyDecorator(dollynho);
		dollynhoWithHoney.printInfo();
		
		// Costs with even more condiments
		Beverage pepsiWithSugarAndHoney = new HoneyDecorator(pepsiWithSugar);
		pepsiWithSugarAndHoney.printInfo();
		
		Beverage dollynhoWithDoubleHoney = new HoneyDecorator(dollynhoWithHoney);
		dollynhoWithDoubleHoney.printInfo();
	}
}
