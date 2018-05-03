package org.inheritance.overriding;

public class Corn extends Vegetable {

	Corn() {
		super("Yellow", "Sweet");
	}
	void soup() {
		System.out.println("Prepare Soup");

	}

	@Override
	void clean() {
		System.out.println("Peel the Skin and Dip in the Water");
	}

}
