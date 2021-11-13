package com.xowrkz.methods.over_riding;

public class Bag {
	private String name;
	private float Sections;
	private Bag conv;

	@Override
	public String toString() {
		System.out.println("Invoked ToString Method");
		return super.toString();
	}

	@Override
	public int hashCode() {
		System.out.println("Invoked Hashcode Method");
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals method");
		if (obj == null) {
			System.out.println("Passed null value,pass a new value again");
			return false;
		}
		if (obj instanceof Bag) {
			System.out.println("Invoked InstanceOf Method");
			conv = (Bag) obj;
			System.out.println("Conversion Completed");
			String memory = ((Bag) obj).getName();
			if (this.name.equals(conv)) {
				System.out.println("Both of them are same");
				return true;
			}
		}

		return super.equals(obj);
	}

	public String getName() {
		return name;
	}

	public String setName(String name) {
		return this.name = name;
	}

	public float getSections() {
		return Sections;
	}

	public void setSections(float sections) {
		Sections = sections;
	}

}
