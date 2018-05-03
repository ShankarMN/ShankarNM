package com.bluestart.airconditioners;

public class CoffeeMachine {

	 Coffee prepareCoffee(Water w, CoffeBeans cb) {
		 System.out.println("Water and CoffeeBeans are put in the machine");
		 Coffee c = new Coffee();
		 System.out.println("Coffee is prepared and ready to pour into glass");
		return new Coffee();
	}

}
