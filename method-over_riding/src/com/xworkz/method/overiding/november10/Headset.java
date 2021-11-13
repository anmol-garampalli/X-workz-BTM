package com.xworkz.method.overiding.november10;

public class Headset {
	private String brandName;
	private String batterCapacity;
	private int warrantyPeriod;

	@Override
	public String toString() {
		System.out.println("Invoked To-String Method");
		return super.toString();
	}

	@Override
	public int hashCode() {
		System.out.println("Invoked HashCode Method");
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

}
