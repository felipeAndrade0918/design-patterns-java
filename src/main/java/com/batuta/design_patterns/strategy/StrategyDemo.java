package com.batuta.design_patterns.strategy;

import com.batuta.design_patterns.strategy.duck.Duck;
import com.batuta.design_patterns.strategy.strategy.CanFly;
import com.batuta.design_patterns.strategy.strategy.CantFly;

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
		Duck rubberDuck = new Duck("Rubber Duck", new CantFly());
		
		System.out.println(rubberDuck.getName());
		System.out.println(rubberDuck.fly());
		
		System.out.println();
		
		rubberDuck.setFlyingAbility(new CanFly());
		
		System.out.println(rubberDuck.getName());
		System.out.println(rubberDuck.fly());
	}
}
