package com.electronics.manufactures;


//Program is to understand how to call one constructor from a constructor using "this" as below and the 

public class LaptopDiff {
	String brandOfLaptop;
	int priceOfLaptop;
	double screenSizeOfLaptop;
	String colorOfTheLaptop;
	int hDDCapacity;

	public LaptopDiff(int priceOfLaptop) {
		this(priceOfLaptop, "Blue", "Dell", 14.5, 500);
		//this should be first line in the constructor method if anything is written above this then it will throw an error
	}

	public LaptopDiff(String brandOfLaptop, double screenSizeOfLaptop) {
		this(35000, "Black", brandOfLaptop, screenSizeOfLaptop, 1000);
		//this should be first line in the constructor method if anything is written above this then it will throw an error
	}

	public LaptopDiff(String colorOfTheLaptop) {
		this(68000, colorOfTheLaptop, "Apple", 13.5, 250);
		//this should be first line in the constructor method if anything is written above this then it will throw an error
	}

	public LaptopDiff(int priceOfLaptop, String colorOfTheLaptop, String brandOfLaptop, double screenSizeOfLaptop,
			int hDDCapacity) {
		this.priceOfLaptop = priceOfLaptop;
		this.colorOfTheLaptop = colorOfTheLaptop;
		this.brandOfLaptop = brandOfLaptop;
		this.screenSizeOfLaptop = screenSizeOfLaptop;
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
