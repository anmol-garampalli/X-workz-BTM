package com.xworkz.interfaces.Temple;

public class ApolloHospital implements Administration {

	public ApolloHospital() {
		System.out.println("Invoked No Argument Constructor");
	}

	@Override
	public String register() {
		System.out.println("Invoked Register Method");
		return null;
	}

	@Override
	public double payAdvance() {
		System.out.println("Invoked payAdvance Method");

		return 5000.00;
	}

	@Override
	public boolean validInsurance() {
		System.out.println("Chcking all the Conditions before admission to the Hospital");
		System.out.println("Invoked valid Insurance Method");
		return false;
	}

}
