package com.xworkz.interfaces.hostel;

public class IndianCitizenStarter {

	public static void main(String[] args) {
		IndianCitizen indianCitizen=new IndianCitizen();
		indianCitizen.validAge();
		indianCitizen.validId();
		indianCitizen.validLicense();
		indianCitizen.licenseNo();
		indianCitizen.validInsurance();
		indianCitizen.validAge();
		indianCitizen.validAge('m', 18);
		
		System.out.println("############");
		
		AfricanCitizen africancitizen=new AfricanCitizen();
		System.out.println(africancitizen.validAge());
		System.out.println(africancitizen.validId());
		System.out.println(africancitizen.validLicense());
		System.out.println(africancitizen.licenseNo());
		System.out.println(africancitizen.validInsurance());
		System.out.println(africancitizen.validAge());
		System.out.println(africancitizen.validAge('f', 16));
		
		
		
		
			
	}

}
