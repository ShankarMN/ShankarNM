package com.rollsroyce.carmanufacture;

public class CarMainManufacture {
	public static void main(String[] args) {

		Car c1 = new Car("Green");
		Car c2 = new Car("Orange", "BahuBali");
		Car c3 = new Car("White", "RaOne", "Petrol");
		c1.CarDetialsDisplay();
		c2.CarDetialsDisplay();
		c3.CarDetialsDisplay();

	}

}
