package com.honda.manufacture;

public class Car {
	String color;
	String brand = "Honda";
	int price;
	int gear;

	void moveForward() {
		System.out.println("Move Forward");
	}

	void disp() {
		System.out.println(this.color + " " + this.brand + "  " + this.price);
	}

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.disp();

		c1.color = "Red";
		c1.price = 1500000;
		c1.moveForward();
		c1.disp();

		// creating second Car

		Car c2 = new Car();

		c2.disp();
		c2.color = "Blue";
		c2.price = 200000;
		c2.moveForward();
		c2.disp();
		
		Car c3 = new Car();
		
		c3.disp();
		c3.color="Silver";
		c3.price=2555555;
		c3.moveForward();
		c3.disp();

		c1.shiftGearUP();
		c1.shiftGearUP();
		c1.shiftGearUP();
		c1.shiftGearUP();
		c1.shiftGearDown();
		c1.shiftGearUP();
		c1.shiftGearUP();
		c1.shiftGearUP();
		c1.shiftGearDown();
		c1.shiftGearDown();
		c1.shiftGearDown();
		c1.shiftGearDown();
		c1.shiftGearDown();
		c1.shiftGearDown();
	}

	void shiftGearUP() {
		if (gear < 5) {
			gear += 1;
		}
		System.out.println("Car is running on Gear" + this.gear);
	}

	void shiftGearDown() {
		if (gear > 0) {
			gear -= 1;
		}
		System.out.println("Car is running on Gear" + this.gear);
	}
}
