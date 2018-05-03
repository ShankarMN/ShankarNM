package org.inheritance.overriding;

public class Potato extends Vegetable {
	Potato(){
		super("Brown","Sweet");
	}
	
	void prepareChips(){
		System.out.println("Chips Prepared");
	}
	

}
