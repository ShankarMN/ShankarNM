package com.axis.mobilebanking;

public class TestingATM {
	public static void main(String[] args) {
		ATM atm = new ATM();
		Card card = new Card();
		atm.withDraw(card);
	}
}
