package org.hotels.cavendine;

public class CalculatorMain {
	public static void main(String[] args) {
		CalculatorMethodOverLoading c = new CalculatorMethodOverLoading();
		System.out.println(c.add(45.6, 58.2));
		System.out.println(c.add(4, 6));
		System.out.println(c.add(5, 6, 7));
	}

}
