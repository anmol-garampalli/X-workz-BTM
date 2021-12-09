package com.xworkz.collections.customdatatype;

import java.io.Serializable;

public class PolicsStationDTO implements Serializable{
	private String name, location, type;
	private int noOfStaff;

	public PolicsStationDTO(String name, String location, String type, int noOfStaff) {
		super();
		this.name = name;
		this.location = location;
		this.type = type;
		this.noOfStaff = noOfStaff;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNoOfStaff() {
		return noOfStaff;
	}

	public void setNoOfStaff(int noOfStaff) {
		this.noOfStaff = noOfStaff;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 9;
	}

	@Override
	public String toString() {
		return "PolicsStationDTO [name=" + name + ", location=" + location + ", type=" + type + ", noOfStaff="
				+ noOfStaff + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof PolicsStationDTO) {
				PolicsStationDTO ref1 = (PolicsStationDTO) obj;
				String namee = ref1.getName();
				String locationn = ref1.getLocation();
				if (name.equals(namee) && location.equals(locationn)) {
					return true;
				}
			}
		}
		return false;
	}

}
