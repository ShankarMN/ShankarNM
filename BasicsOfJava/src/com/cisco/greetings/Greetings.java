package com.cisco.greetings;

public class Greetings {
	public static void main(String[] args) {
		Greetings obj = new Greetings();
		obj.greet("Shankar");
	}

	void greet(String name) {
		System.out.println("Hello " + name);
	}

}
