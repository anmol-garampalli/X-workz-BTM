package com.xworkz.method.overiding.november10;

public class Watch {
	private String name;
	private int price;
	// enum WatchType;

	@Override
	public String toString() {
		System.out.println("Invoked To String Method"); // ToString method
		return super.toString();
	}

	@Override
	public int hashCode() {
		System.out.println("Invoked Hashcode method");
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked Equals Method");
		if (obj == null) {
			System.out.println("You have passed null value,check again");
			return false;
		}
		if (obj instanceof Watch) {
			System.out.println("Watch is an instance of watch");
			Watch type = (Watch) obj;
			System.out.println("Conversion Completed");
			String storedString = ((Watch) obj).getName();
			if (this.name.equals(storedString)) {
				System.out.println("Both the names are identical");
				return true;

			}
			return false;
		}

		return super.equals(obj);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
