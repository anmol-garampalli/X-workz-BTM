package com.xowrkz.methods.over_riding;

public class IceCreamStarter {

	public static void main(String[] args) {
		IceCream icecream = new IceCream();
		IceCream icecream2 = new IceCream();

		System.out.println(icecream.toString());
		System.out.println(icecream2.toString());

		System.out.println(icecream.hashCode());
		System.out.println(icecream2.hashCode());

		System.out.println(icecream.setBrandName("Amul"));
		System.out.println(icecream.setBrandName("Amul"));
		System.out.println(icecream.equals(icecream2));

	}

}
