package com.xworkz.blinding.lights;

public class IronBox {

	private String brand;
	private String type;
	private boolean working;
	private double minTemp;
	private double maxTemp;

	protected IronBox() {
		super();
		System.out.println("Invoke no arg constructor of IronBox");
	}

	public IronBox(String brand, String type, boolean working, double minTemp, double maxTemp) {
		super();
		this.brand = brand;
		this.type = type;
		this.working = working;
		this.minTemp = minTemp;
		this.maxTemp = maxTemp;
	}

	public String getBrand() {
		return brand;
	}

	public String getType() {
		return type;
	}

	public boolean isWorking() {
		return working;
	}

	public double getMinTemp() {
		return minTemp;
	}

	public double getMaxTemp() {
		return maxTemp;
	}

}
