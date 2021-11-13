package com.xowrkz.methods.over_riding;

public class SweetStarter {

	public static void main(String[] args) {
		System.out.println("This is the main method");
		Sweet sweet=new Sweet("Dharwad Peda", "Mishra Sweets", 5, 250, (float) 350.5);
		System.out.println(sweet);
		sweet.getName();
		sweet.getPrice();
		sweet.getQuantity();
		sweet.getSupplier();
		sweet.sweetCalories();
	
	}

}

