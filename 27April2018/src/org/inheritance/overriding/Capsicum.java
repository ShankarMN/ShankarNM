package org.inheritance.overriding;

public class Capsicum extends Vegetable {
	Capsicum() {
		super("Green", "Spicy");
	}

	void preparePizza() {
		System.out.println("Prepare Pizza");

	}

	@Override
	void clean() {
		System.out.println("dip in the Water");
	}

}
