package com.fruitcomapany.fruitmodule;

public class Fruit {
	String color;
	int price;
	
	void clean()
	{
		System.out.println("Clean and Slice the Fruit");
	}
	void prepareJuice(){
		this.clean();
		System.out.println("add to mixer and crush");
	}

}
