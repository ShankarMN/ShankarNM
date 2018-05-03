package com.electronics.manufactures;

public class Laptop {
	String brandOfLaptop;
	int priceOfLaptop;
	double screenSizeOfLaptop;
	String colorOfTheLaptop;
	int hDDCapacity;

	public Laptop(int priceOfLaptop) {
		this.priceOfLaptop = priceOfLaptop;
		this.brandOfLaptop="Dell";
		this.screenSizeOfLaptop=14.5;
		this.colorOfTheLaptop="Blue";
		this.hDDCapacity=500;
		this.displayTheDetailsOfLaptop();
	}

	public Laptop(String brandOfLaptop, double screenSizeOfLaptop) {
		this.brandOfLaptop = brandOfLaptop;
		this.screenSizeOfLaptop = screenSizeOfLaptop;
		this.colorOfTheLaptop="Black";
		this.priceOfLaptop=35000;
		this.hDDCapacity=1000;
		this.displayTheDetailsOfLaptop();
	}

	public Laptop(String colorOfTheLaptop) {
		this.colorOfTheLaptop = colorOfTheLaptop;
		this.brandOfLaptop="Apple";
		this.priceOfLaptop=68000;
		this.screenSizeOfLaptop=13.5;
		this.hDDCapacity=250;
		this.displayTheDetailsOfLaptop();
	}

	public Laptop(String brandOfLaptop, int priceOfLaptop, double screenSizeOfLaptop, String color, int hDDCapacity) {
		this.brandOfLaptop = brandOfLaptop;
		this.priceOfLaptop = priceOfLaptop;
		this.screenSizeOfLaptop = screenSizeOfLaptop;
		this.colorOfTheLaptop = color;
		this.hDDCapacity = hDDCapacity;
		this.displayTheDetailsOfLaptop();
	}

	void displayTheDetailsOfLaptop() {
		System.out.println("Brand of the Laptop is " + "  " + this.brandOfLaptop);
		System.out.println("Laptop Cost is " + "   " + this.priceOfLaptop);
		System.out.println("Screensize of the Laptop is " + "   " + this.screenSizeOfLaptop);
		System.out.println("Color of the Laptop is " + "   " + this.colorOfTheLaptop);
		System.out.println("Hard Disk Memory Capacity is " + "   " + this.hDDCapacity);
		System.out.println("*************************************************************");
	}

}
