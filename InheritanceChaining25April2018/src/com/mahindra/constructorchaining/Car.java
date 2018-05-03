package com.mahindra.constructorchaining;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Car extends Vehicle {
	boolean isACPresent;

	Car(String color, int price, boolean isACPresent) {
		super(color, price);
		this.isACPresent = isACPresent;
	}

	Car() {
		this("Black", 500000, true);
		System.out.println("Zero paramter constructor");
	}

	public static void main(String[] args) {
		Car c = new Car();
	}
}
