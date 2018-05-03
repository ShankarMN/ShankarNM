package com.jubilantfoods.dominos;

public class Burger {
	String brandOfBurger = "Dominos";
	int priceOfBurger;
	boolean isCheesy;
	String typeOfBurger;

	Burger(String typeOfBurger) {
		this(typeOfBurger, true, 150);
	}

	Burger(String typeOfBurger, boolean isCheesy) {
		this(typeOfBurger, isCheesy, 500);
	}

	public Burger(String typeOfBurger, boolean isCheesy, int priceOfBurger) {
		this.typeOfBurger = typeOfBurger;
		this.isCheesy = isCheesy;
		this.priceOfBurger = priceOfBurger;
		this.displayDetailsOfBurger();
	}

	 void displayDetailsOfBurger() {

		if (this.isCheesy == true) {
			System.out.println("Details of the Burger is as follows");
			System.out.println("Brand of Burger :" + "     " + this.brandOfBurger);
			System.out.println("Type of Burger" + "     " + this.typeOfBurger);
			System.out.println("Burger with Cheese");
			System.out.println("Price of the Burger" + "     " + this.priceOfBurger);
			System.out.println("******************************************************");
		} else if (this.isCheesy==false){
			System.out.println("Details of the Burger is as follows");
			System.out.println("Brand of Burger :" + "     " + this.brandOfBurger);
			System.out.println("Type of Burger" + "     " + this.typeOfBurger);
			System.out.println("Burger without Cheese");
			System.out.println("Price of the Burger" + "     " + this.priceOfBurger);
			System.out.println("*******************************************************");
		}

	}
}
