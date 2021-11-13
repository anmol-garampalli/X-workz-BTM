package com.xworkz.method.presentation;

public class Method {
	static int sum;

	static int addTwoInt(int a, int b, int c) {
		sum = a + b + c;
		return sum;

	}

	public static void main(String[] args) {
		int sum = addTwoInt(4, 2, 3);
		System.out.println(sum);

	}

}
