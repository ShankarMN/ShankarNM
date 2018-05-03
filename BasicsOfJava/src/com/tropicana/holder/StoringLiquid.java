package com.tropicana.holder;

public class StoringLiquid {
	public static void main(String[] args) {
		Bottle bott = new Bottle();
		Juice jui = new Juice();
		bott.store(jui);
		Water wat = new Water();
		bott.store(wat);
		Oil oily = new Oil();
		bott.store(oily);
	}

}
