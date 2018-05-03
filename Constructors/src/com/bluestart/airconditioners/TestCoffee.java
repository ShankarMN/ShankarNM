package com.bluestart.airconditioners;

public class TestCoffee {
	public static void main(String[] args) {
		CoffeeMachine cm = new CoffeeMachine();
		Water w = new Water();
		CoffeBeans cb = new CoffeBeans();
		Coffee cof = cm.prepareCoffee(w, cb);
		System.out.println("Coffee Recieved");
	}

}
