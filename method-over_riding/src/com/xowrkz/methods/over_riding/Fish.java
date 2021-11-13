package com.xowrkz.methods.over_riding;

public class Fish {
	private String Fishname;
	private float price;
	private String color;
	FishType type;

	@Override
	public String toString() {
		System.out.println("Invoked toString Method");
		return super.toString();
	}

	@Override
	public int hashCode() {
		System.out.println("Invoked Hashcode Method");
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals Method");
		return super.equals(obj);
	}

	public FishType getType() {
		return type;
	}

	public void setType(FishType type) {
		this.type = type;
	}

	public String getFishname() {
		return Fishname;
	}

	public String setFishname(String fishname) {
		return Fishname = fishname;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	} 

}
