package com.xworkz.collections.customdatatype;

public class ChoclateDTO {
	private String name, type;
	private int weight, calories;
	private double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public ChoclateDTO(String name, String type, int weight, int calories, double price) {
		super();
		this.name = name;
		this.type = type;
		this.weight = weight;
		this.calories = calories;
		this.price = price;
	}

	@Override
	public String toString() {
		return "ChoclateDTO [name=" + name + ", type=" + type + ", weight=" + weight + ", calories=" + calories
				+ ", price=" + price + ", getName()=" + getName() + ", getType()=" + getType() + ", getWeight()="
				+ getWeight() + ", getCalories()=" + getCalories() + ", getPrice()=" + getPrice() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof ChoclateDTO) {
				ChoclateDTO ref1 = (ChoclateDTO) obj;
				String namee = ref1.getName();
				String typee = ref1.getType();
				if (name.equals(namee) && type.equals(typee)) {
					return false;
				}
			}
		}

		return true;
	}

}
