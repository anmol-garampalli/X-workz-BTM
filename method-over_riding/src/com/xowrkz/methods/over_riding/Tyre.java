package com.xowrkz.methods.over_riding;

public class Tyre {
	private String brand;
	private int price;
	TyreType type;

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals Method");
		if (obj == null) {
			System.out.println("Object has null value");
		}
		if (obj instanceof Tyre) {
			Tyre type = (Tyre) obj;
			System.out.println("Conversion Completed");
			String stored = ((Tyre) obj).getBrand();
			if (this.getBrand().equals(stored)) {
				System.out.println("Both are Identical");
			}
		}

		return super.equals(obj);
	}

	public String getBrand() {
		return brand;
	}

	public String setBrand(String brand) {
		return this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
