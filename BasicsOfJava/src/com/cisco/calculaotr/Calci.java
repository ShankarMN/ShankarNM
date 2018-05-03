package com.cisco.calculaotr;

public class Calci {
	public static void main(String[] args) {
		Calci obj = new Calci();
		Calci obj1 = new Calci();
		Calci obj2 = new Calci();
		obj.multiplicationOfNumbers(3, 4, 5);
		obj1.additionOfNumbers(4, 5);
		obj.subtractionOfNumbers(19, 6);
		obj2.divisionOfNumbers(52,2);

	}

	 void additionOfNumbers(int n1, int n2) {
		int result = n1 + n2;
		System.out.println(result);
	}

	void divisionOfNumbers(int i, int j) {
		 int result = i/j;
		 System.out.println(result);
	}

	int multiplicationOfNumbers(int n1, int n2, int n3) {
		int res = n1 * n2 * n3;
		System.out.println(res);
		return res;
	}

	void subtractionOfNumbers(int i, int j) {
		int res = i - j;
		System.out.println(res);
	}
}
