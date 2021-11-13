package com.xowrkz.methods.over_riding;

public class BagPacker {

	public static void main(String[] args) {
		Bag bag=new Bag();
		Bag bag2=new Bag();
		
		System.out.println(bag.toString());
		System.out.println(bag.toString());
		
		System.out.println(bag2.toString());
		System.out.println(bag2.hashCode());
		
		System.out.println(bag.setName("Wildcraft"));
		System.out.println(bag2.setName("Nike"));
		System.out.println(bag.equals(bag2));
		
		
		
		
		
		
	}

}
