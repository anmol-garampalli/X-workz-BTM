package com.xworkz.interfaces.hostel;

public class AfricanCitizen implements TrafficRule, MarriageRule, votingRule {

	public String validId() {
		// TODO Auto-generated method stub
		return null;
	}

	private void validage() {
		// TODO Auto-generated method stub

	}

	public String licenseNo() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean validInsurance() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validAge(char Gender, int Age) {
		System.out.println("Age method Invoked");

		if (Gender == 'm' && Age == 18) {
			System.out.println("He is eligible for marriage");

		}

		return false;
	}

	@Override
	public int validAge() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean validLicense() {
		// TODO Auto-generated method stub
		return false;
	}

}
