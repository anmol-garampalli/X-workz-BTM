package com.xowrkz.methods.over_riding;

public class Stadium {
	private String name;
	private String city;
	private float areaInMeters;

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked Equals Method");
		if (obj == null) {
			System.out.println("You have passed null value");
			return false;
		}
		if (obj instanceof Stadium) {
			Stadium store = (Stadium) obj;
			System.out.println("Conversion Started");
			String tempStorage = ((Stadium) obj).getName();
			if (this.name.equals(tempStorage)) {
				System.out.println("Both the values are identical");
				return true;
			} else {
				System.out.println("Both the values are different");
				return false;
			}
		}
		return super.equals(obj);
	}

	public Stadium(String name, String city, float areaInMeters) {
		super();
		this.name = name;
		this.city = city;
		this.areaInMeters = areaInMeters;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public float getAreaInMeters() {
		return areaInMeters;
	}

	public void setAreaInMeters(float areaInMeters) {
		this.areaInMeters = areaInMeters;
	}

}
