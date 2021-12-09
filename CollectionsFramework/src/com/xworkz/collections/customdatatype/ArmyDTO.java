package com.xworkz.collections.customdatatype;

public class ArmyDTO {

	private String name, location, type, specalization;
	private int size;

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

	public String getSpecalization() {
		return specalization;
	}

	public void setSpecalization(String specalization) {
		this.specalization = specalization;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public int hashCode() {

		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof ArmyDTO) {
				ArmyDTO ref1 = (ArmyDTO) obj;
				String namee = ref1.getName();
				String locationn = ref1.getLocation();
				if (name.equals(namee) && location.equals(locationn)) {
					return true;
				}
			}
		}

		return false;
	}

	@Override
	public String toString() {
		return "ArmyDTO [name=" + name + ", location=" + location + ", type=" + type + ", specalization="
				+ specalization + ", size=" + size + ", getName()=" + getName() + ", getLocation()=" + getLocation()
				+ ", getType()=" + getType() + ", getSpecalization()=" + getSpecalization() + ", getSize()=" + getSize()
				+ ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString()
				+ "]";
	}

	public ArmyDTO(String name, String location, String type, String specalization, int size) {
		super();
		this.name = name;
		this.location = location;
		this.type = type;
		this.specalization = specalization;
		this.size = size;
	}

}
