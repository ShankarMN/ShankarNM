package com.mr.atmexample;

public class ATMMain {
	public static void main(String[] args) {
		ATM a = new ATM();
		Card c = new Card();
		System.out.println("Insert the Card and Provide the Pin Number");
		Money my = a.withDraw(c, 1234);
		System.out.println("Money Recieved");
	}
}
