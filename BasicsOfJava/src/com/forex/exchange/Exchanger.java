package com.forex.exchange;

public class Exchanger {

	public static void main(String[] args) {
		Exchanger exchg = new Exchanger();
		double inr = exchg.convetDollarToRupees(5.91);
		System.out.println((int) inr);

	}

	double convetDollarToRupees(double noOfDollars) {
		double INR = (noOfDollars * 64.91) * 0.98;
		return INR;
	}

}
