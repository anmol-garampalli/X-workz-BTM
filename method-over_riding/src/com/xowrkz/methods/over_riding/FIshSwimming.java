package com.xowrkz.methods.over_riding;

public class FIshSwimming {

	public static void main(String[] args) {
		Fish fish = new Fish();
		Fish fish2 = new Fish();

		System.out.println(fish.toString());
		System.out.println(fish2.toString());

		System.out.println(fish.hashCode());
		System.out.println(fish2.hashCode());

		System.out.println(fish.setFishname("Salman"));
		System.out.println(fish2.setFishname("Salman"));
		System.out.println(fish.equals(fish2));

	}

}
