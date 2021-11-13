package com.xowrkz.methods.over_riding;

public class BeltHItting {

	public static void main(String[] args) {
		Belt belt = new Belt();
		Belt belt2 = new Belt();

		System.out.println(belt.toString());
		System.out.println(belt2.toString());

		System.out.println(belt.hashCode());
		System.out.println(belt2.hashCode());

		System.out.println(belt.setMaterialType("Leather"));
		System.out.println(belt2.setMaterialType("Nylon"));
		System.out.println(belt.equals(belt2));

	}

}
