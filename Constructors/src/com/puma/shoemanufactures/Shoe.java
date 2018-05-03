package com.puma.shoemanufactures;

public class Shoe {
	String brand = "Puma";
	int size;
	String color;
	String material;

	public Shoe(int size) {
		this.size = size;
		this.color = "Black";
		this.material = "Leather";
		this.show();
	}

	private void show() {
		System.out.println(this.brand + "  " + this.color + "   " + this.size + "   " + this.material);
	}

	public Shoe(int size, String color) {
		this.size = size;
		this.color = color;
		this.material = "Poymer";
		this.show();
	}

	public Shoe(int size, String color, String material) {
		this.size = size;
		this.color = color;
		this.material = material;
		this.show();
	}

	public Shoe(int size, String color, String material,String brand) {
		this.brand = brand;
		this.size = size;
		this.color = color;
		this.material = material;
		this.show();
	}
	

}
