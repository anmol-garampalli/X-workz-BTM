package com.xworkz.weekend.programmingaptitude;

public class ReversStar {

	public static void main(String[] args) {
		for (int row = 1; row >= 5; row++) {
			for (int col = 1; col >= 5; col--) {
				if (row <= col) {
					System.out.println("*");

				}

			}
			System.out.println();
		}

	}

}
