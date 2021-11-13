package com.xowrkz.methods.over_riding;

public class Aeroplane {
	private String name;
	private String Company;
	private String Government;

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked Equals Method");
		if (obj == null) {
			System.out.println("You Have passed null value check again");
		}
		if (obj instanceof Aeroplane) {
			Aeroplane storage = (Aeroplane) obj;
			System.out.println("Conversion Happened");
			String memory = ((Aeroplane) obj).getName();
			System.out.println("Both are identical");
			return true;
		}

		return super.equals(obj);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return Company;
	}

	public String setCompany(String company) {
		return Company = company;
	}

	public String getGovernment() {
		return Government;
	}

	public void setGovernment(String government) {
		Government = government;
	}

}
