package com.tropicana.holder;

public class Bottle {
	void store(Water w) {
		System.out.println("This Method Stores Water");
	}

	void store(Juice j) {
		System.out.println("This Method Stores JuicJ");
	}

	void store(Oil o) {
		System.out.println("This Method Stores Oil");
	}

}
/*Even though the method is same here the concept is method overloading we are passing the objects of different class types i.e */
