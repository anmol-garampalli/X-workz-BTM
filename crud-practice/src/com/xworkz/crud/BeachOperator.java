package com.xworkz.crud;

public class BeachOperator {
	private String country = new String();
	private String[] beachNames = new String[10]; // why are we declaring them here
	private int counter;

	public BeachOperator() { // what does () mean
		this("INDIA");
		System.out.println("Invoked no-arg branch operator constructor");
	}

	public BeachOperator(String country) {
		this.country = country;
		System.out.println("Invoked  BeachOperator String const");
	}

	public String getCountry() { // error
		return country;
	}

	public void addBeachName(String name) {
		System.out.println("Invoked add beach name");
		System.out.println("Name arg:".concat(name));
		if (this.counter < 5) {
			this.beachNames[this.counter] = name;
			this.counter++; // did not understand this line
		} else {
			System.err.println("Array is completly occupied, cannot modify");
		}
	}

	public void displayBeachNames() {
		System.out.println("Invoked display beach names");
		for (int aswathama = 0; aswathama < this.beachNames.length; aswathama++) {
			String name = this.beachNames[aswathama];
			System.out.println(name);
		}
	}
}
