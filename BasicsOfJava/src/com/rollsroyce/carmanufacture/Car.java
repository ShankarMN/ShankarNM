package com.rollsroyce.carmanufacture;

public class Car {
	String color;
	String model;
	String variant;
	String brand = "RollsRoyce";

	Car(String color) {
		this.color = color;
		this.model = "Ghost";
		this.variant = "Petrol";
	}

	Car(String color, String model) {
		this.color = color;
		this.model = model;
		this.variant = "Diesel";
	}

	Car(String color, String model, String variant) {
		this.color = color;
		this.model = model;
		this.variant = variant;
	}

	void CarDetialsDisplay() {
		System.out.println("Brand   of the Car " + "    " + this.brand);
		System.out.println("Color   of the Car " + "    " + this.color);
		System.out.println("Model   of the Car " + "    " + this.model);
		System.out.println("Variant of the Car " + "    " + this.variant);
		System.out.println();
	}
}
