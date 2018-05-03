package com.example.methodoverriding;

public class VehicleMain {

	public static void main(String[] args) {
		Truck truck1 = new Truck();
		truck1.start();
		System.out.println(truck1);

		Car car1 = new Car();
		car1.start();
		System.out.println(car1);

		Bike bike1 = new Bike();
		bike1.start();
		System.out.println(bike1);
	}
}
