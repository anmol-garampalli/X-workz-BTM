package com.xworkz.collections.customdatatype;

import java.io.Serializable;

public class OfficeDTO implements Serializable {
	private String name, location;
	private int numstaff, cabins;

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {

		return 9;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof OfficeDTO) {
				OfficeDTO ref1 = (OfficeDTO) obj;
				String tempname = ref1.getName();
				String templocation = ref1.getLocation();
				if (name.equals(tempname) && location.equals(templocation)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "OfficeDTO [name=" + name + ", location=" + location + "]";
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

	public int getNumstaff() {
		return numstaff;
	}

	public void setNumstaff(int numstaff) {
		this.numstaff = numstaff;
	}

	public int getCabins() {
		return cabins;
	}

	public void setCabins(int cabins) {
		this.cabins = cabins;
	}

	public OfficeDTO(String name, String location, int numstaff, int cabins) {
		super();
		this.name = name;
		this.location = location;
		this.numstaff = numstaff;
		this.cabins = cabins;
	}

}
