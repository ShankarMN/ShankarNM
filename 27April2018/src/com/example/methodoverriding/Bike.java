package com.example.methodoverriding;

public class Bike extends Vehicle {
	@Override
	void start() {
		System.out.println("Insert the key and Press button to Start");
	}

}
