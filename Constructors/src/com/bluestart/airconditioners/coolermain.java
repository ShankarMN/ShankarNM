package com.bluestart.airconditioners;

public class coolermain {
	public static void main(String[] args) {
		cooler c1 = new cooler();
		Air a = c1.cool(new ColdWater());
		System.out.println("its feeling cool now");
	}

}
