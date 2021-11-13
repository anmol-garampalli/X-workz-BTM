package com.xowrkz.methods.over_riding;

public class City {
	private String cityName;
	private String state;
	private String CountryName;

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals Method");
		if (obj == null) {
			System.out.println("You have passed null, ReEnter your Input");
		}
		if (obj instanceof City) {
			City newname = (City) obj;
			System.out.println("Convesrion Completed");
			String storeString = ((City) obj).getCityName();
			if (this.cityName.equals(storeString)) {
				System.out.println("Both the names are identical");
			}

		}

		return super.equals(obj);
	}

	public String getCityName() {
		return cityName;
	}

	public String setCityName(String cityName) {
		return this.cityName = cityName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountryName() {
		return CountryName;
	}

	public void setCountryName(String countryName) {
		CountryName = countryName;
	}

}
