package com.xworkz.blinding.lights;

public class PhilipsIronBox extends IronBox {

	public PhilipsIronBox() {
		super();
		System.out.println("Invoked Philips No argument constructor");

	}

	public PhilipsIronBox(String brand, String type, boolean working, double minTemp, double maxTemp) {
		super(brand, type, working, minTemp, maxTemp);
		System.out.println("Invoked String,boolean,double const from Philips");
	}
	public void displayDetails() {
		System.out.println(super.getBrand());
		System.out.println(super.getMaxTemp());
		System.out.println(super.getMinTemp());
		System.out.println(super.isWorking());
		
		
	}
	
	
	
}
