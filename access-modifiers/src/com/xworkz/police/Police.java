package com.xworkz.police;

public class Police {
	public String name;
	protected String designation;
	protected float experience;
	public Policedept department;
	protected int noOfStars;

	protected Police() {
		super();
		System.out.println("Invoked no argument constructor");

	}

	protected void displayDetails() {

		System.out.println("Invoked display details from police");
	}

}
