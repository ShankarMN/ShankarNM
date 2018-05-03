package org.inheritance.overriding;

public class Vegetable {
	String color;
	String type;

	public Vegetable(String color, String type) {
		this.color = color;
		this.type = type;
	}
	
	void clean(){
		System.out.println("Cut , peel the Skin and dip in the Water");
	}

}
