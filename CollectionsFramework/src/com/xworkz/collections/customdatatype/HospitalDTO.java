package com.xworkz.collections.customdatatype;

import java.io.Serializable;

public class HospitalDTO  implements Serializable{

	@Override
	public String toString() {
		return "HospitalDTO [name=" + name + ", location=" + location + ", type=" + type + ", noofbeds=" + noofbeds
				+ ", getName()=" + getName() + ", getLocation()=" + getLocation() + ", getType()=" + getType()
				+ ", hashCode()=" + hashCode() + ", getNoofbeds()=" + getNoofbeds() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}

	private String name, location, type;
	private int noofbeds;

	public HospitalDTO(String name, String location, String type, int noofbeds) {
		super();
		this.name = name;
		this.location = location;
		this.type = type;
		this.noofbeds = noofbeds;
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

	@Override
	public int hashCode() {

		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof HospitalDTO) {
				HospitalDTO ref1 = (HospitalDTO) obj;
				String name2 = ref1.getName();
				String location2 = ref1.getLocation();
				if (name.equals(name2) && location.equals(location2)) {
					return true;
				}
			}
		}

		return false;
	}

	public int getNoofbeds() {
		return noofbeds;
	}

	public void setNoofbeds(int noofbeds) {
		this.noofbeds = noofbeds;
	}

}
