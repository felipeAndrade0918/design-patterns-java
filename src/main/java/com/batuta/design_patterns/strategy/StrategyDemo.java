package com.batuta.design_patterns.strategy;

import com.batuta.design_patterns.strategy.duck.Duck;
import com.batuta.design_patterns.strategy.duck.RubberDuck;
import com.batuta.design_patterns.strategy.duck.WildDuck;
import com.batuta.design_patterns.strategy.strategy.CanFly;

public class StrategyDemo {

	/**
	 * Use strategy pattern when you have a family of algorithms
	 * and want to make them interchangeable at runtime.
	 * 
	 * <br>
	 * 
	 * You can avoid conditionals and duplicated code.
	 * You can also add additional behaviours without changing the code,
	 * since you are using polymorphism.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Duck wildDuck = new WildDuck();
		Duck rubberDuck = new RubberDuck();
		
		wildDuck.printName();
		wildDuck.fly();
		
		System.out.println();
		
		rubberDuck.printName();
		rubberDuck.fly();
		
		rubberDuck.setFlyingAbility(new CanFly());
		
		System.out.println();
		
		rubberDuck.printName();
		rubberDuck.fly();
	}
}
