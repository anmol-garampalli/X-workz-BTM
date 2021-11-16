package com.xworkz.interfaces.hostel;

public class IndianCitizen implements votingRule,MarriageRule,TrafficRule {
	
	@Override
	public String validId() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private void validage() {
		// TODO Auto-generated method stub

	}
	
	@Override
		public String licenseNo() {
			// TODO Auto-generated method stub
			return null;
		}
	
	
	@Override
	public boolean validInsurance() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
		public boolean validAge(char Gender, int Age) {
			System.out.println("Age method Invoked");		
			

			if (Gender == 'm' && Age == 18) {
				System.out.println("He is eligible for marriage");
				return true;
				
			}
			
			
			return false;
		}
	
	private String name;
	private String address;
	
	public void displayNameandddressDetails() {
		System.out.println("Invoked name and address method");
	}


	@Override
	public boolean validLicense() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public int validAge() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	}


