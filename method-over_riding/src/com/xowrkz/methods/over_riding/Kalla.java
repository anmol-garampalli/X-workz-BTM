package com.xowrkz.methods.over_riding;

public class Kalla {

	private String name;
	private String specalization;
	private int experinece;
	private int noOfCases;
	private String areaOfDuty;
	private int age;

	public Kalla() {
		System.out.println("Invoked no-argument constructor");

	}

	public String getName() {
		return name;
	}

	public String getSpecalization() {
		return specalization;
	}

	public int getExperinece() {
		return experinece;
	}

	public int getNoOfCases() {
		return noOfCases;
	}

	public String getAreaOfDuty() {
		return areaOfDuty;
	}

	public int getAge() {
		return age;
	}

	public Kalla(String name, String specalization, int experinece, int noOfCases, String areaOfDuty, int age) {
		super();
		this.name = name;
		this.specalization = specalization;
		this.experinece = experinece;
		this.noOfCases = noOfCases;
		this.areaOfDuty = areaOfDuty;
		this.age = age;
	}

	public void Robbery(String deviceName) {
		System.out.println("Invoked Robbery Method: ".concat(deviceName));
		
	}

	public String Sellingplace(String location) {
		System.out.println("Invoke Selling Location Method");
		return location;

	}

}
