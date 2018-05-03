package org.hotels.cavendine;

public class CalculatorMethodOverLoading {
	double add(double n1, double n2) {
		double d = n1 + n2;
		return d;
	}

	int add(int n1, int n2) {
		int n = n1 + n2;
		return n;
	}

	int add(int n1, int n2, int n3) {
		int n = n1 + n2 + n3;
		return n;
	}

}
