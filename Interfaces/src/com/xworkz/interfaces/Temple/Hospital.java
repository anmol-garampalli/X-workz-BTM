package com.xworkz.interfaces.Temple;

public class Hospital {
	private String name;
	private String location;
	
	public String admitPatient() {
		System.out.println("Invoked Admit Rule");
		return "Patient cannot be Admitted";
	}
	public String dischargePatient() {
		System.out.println("Invoked Discharge Rule");
		return "The patient cannot be discharged until all formalities are completed";
	}
	public Hospital(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}


}
