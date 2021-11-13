package com.xowrkz.methods.over_riding;

public class Food {
	private String foodname;
	private int quantity;
	private String quality;
	 
	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals method");
		if (obj == null ) {
			System.out.println("Passed null value check again");
		}
		if (obj instanceof Food) {
			Food foodie = (Food) obj;
			System.out.println("Conversion Completed");
			String stored=((Food) obj).getFoodname();
			if (this.foodname.equals(stored)) {
				System.out.println("Both are identical");
				return true;
			}
		}
		
		
		return super.equals(obj);
	}
	
	public String getFoodname() {
		return foodname;
	}
	public String setFoodname(String foodname) {
		return this.foodname = foodname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	
	

}
