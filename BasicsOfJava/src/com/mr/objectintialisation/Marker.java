package com.mr.objectintialisation;

public class Marker {
	String color;
	String brand = "Reynolds";
	int price = 50;

	public static void main(String[] args) {
		Marker m1 = new Marker();
		Marker m2 = new Marker();

		System.out.println(m1);
		// printed com.mr.objectintialisation.Marker@6d06d69c

		System.out.println(m2);
		// printed

		m1.color = "Red";
		m2.color = "Black";

		System.out.println(m1.color);
		System.out.println(m2.color);

	}

}
