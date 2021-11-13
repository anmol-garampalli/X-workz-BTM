package com.xowrkz.methods.over_riding;

public class FoodEating {

	public static void main(String[] args) {
		Food food = new Food();
		Food food2 = new Food();

		System.out.println(food.setFoodname("Idli"));
		System.out.println(food2.setFoodname("Idli"));
		System.out.println(food.equals(food2));
	}

}
