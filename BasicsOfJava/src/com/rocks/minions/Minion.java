package com.rocks.minions;

public class Minion {

	public static void main(String[] args) {
		Minion m1 = new Minion();
		m1.sleep();
		m1.talk();
		m1.walk();
		Minion m2 = new Minion();
		m2.name = "Stuart";
		m2.heightOfMinion = 3.45;
		System.out.println(m2.name + m2.heightOfMinion);
		m2.walk();
	}

	String name = "Bob";
	String color = "white";
	byte noOfHands = 2;
	byte noOfLegs = 2;

	double heightOfMinion = 3.2;

	void sleep() {
		System.out.println("Sleep");
	}

	void talk() {
		System.out.println("Talk");
	}

	void walk() {
		System.out.println("Walk");

	}
}
