package com.xowrkz.methods.over_riding;

public class Sweet {
	private String name;
	private String supplier;
	private int quantity;
	private int price;
	private float weight;

	
	public Sweet() {
		System.out.println("Invoke no argument sweet Constructor");
	}
	
	public void sweetDetails() {
		System.out.println("Invoked sweet details method " .concat(getName()) );
	}
	
	public void sweetCalories() {
		System.out.println("Invoked sweet calories method " .concat(getSupplier()));
	}
	
	
	public Sweet(String name, String supplier, int quantity, int price, float weight) {
		super();
		this.name = name;
		this.supplier = supplier;
		this.quantity = quantity;
		this.price = price;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public String getSupplier() {
		return supplier;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getPrice() {
		return price;
	}

	public float getWeight() {
		return weight;
	}

}
