package com.mr.objectintialisation;

public class Fan {
	String color;
	int noOfBlades = 3;
	String brand = "Almonard";

	void blowAir() {
		System.out.println("Blow Air");
	}

	void showDetails() {
		System.out.println(this.color + " " + this.noOfBlades + " " + this.brand);
	}

	public static void main(String[] args) {
		Fan f1 = new Fan();
		f1.color = "Green";
		f1.showDetails();
		f1.blowAir();

		Fan f2 = new Fan();
		f2.showDetails();
		f2.color = "Brown";
		f2.showDetails();
	}
}
