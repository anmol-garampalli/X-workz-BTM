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
		return 0;
	}

	@Override
	public boolean validInsurance() {
		System.out.println("Invoked valid Insurance Method");		
		return false;
	}

}

	