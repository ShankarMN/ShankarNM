package com.cartoons.disneyland;

import java.util.Random;

public class Lamp {

	Object heatUp() {
		Random ran = new Random();
		int num = ran.nextInt(5)+ 1;

		switch (num) {
		case 1:
			System.out.println("Genie to be popped up");
			return new Genie();

		case 2:
			System.out.println("Mini to be popped up");
			return new Mini();

		default:
			return null;
		}
	}

}
