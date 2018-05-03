package com.adobe.constructors;

public class Student {
	int id;
	String name;

	Student(int id, String name) // Custom Construtor
	{
		this.id = id;
		this.name = name;
		System.out.println(this.id + " " + this.name);
	}

	Student() {
		this.id = 100;
		this.name = "Dummy";
		System.out.println(this.id + "  " + this.name);
	}

	public static void main(String[] args) {
		// Creating the Object with the Custom Constructor, ifthe Custom the
		// Custom Constructor is present then the compiler wont create the
		// Default Constructor

		Student studentOne = new Student(0001, "Shankar");
		Student studentTwo = new Student();

	}
}
