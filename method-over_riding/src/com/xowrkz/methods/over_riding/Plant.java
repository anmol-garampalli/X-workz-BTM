package com.xowrkz.methods.over_riding;

import javax.management.ObjectName;

public class Plant {
	private String name;
	private boolean isAlive;
	public PlantType type;

	@Override
	public String toString() {
		System.out.println("Invoked ToString Method");
		return super.toString();
	}

	@Override
	public int hashCode() {
		System.out.println("Invoked HashCode Method");
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals Method");
		if (obj == null) {
			System.out.println("You have passed a null value");
			return false;
		}

		if (obj instanceof Plant) {
			System.out.println("Plant is an instance of plant");
			Plant conversion = (Plant) obj;
			System.out.println("Conversion Started");
			String storage = ((Plant) obj).getName();
			if (this.name.equals(conversion)) {
				System.out.println("Both have same values");
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public String setName(String name) {
		return this.name = name;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

}
