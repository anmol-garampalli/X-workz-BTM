package com.xworkz.interfaces.Temple;

public class PublicDevotees implements DevoteeRules {
	@Override
	public boolean noSlippers() {
		System.out.println("Invoked No SLippers Method");		
		return true;
	}
	@Override
	public boolean noPhotography() {
		System.out.println("Invoked No Photography method");		
		return true;
	}
	@Override
	public boolean neatness() {
		System.out.println("Invoked neatness Method");		
		return true;
	}
	@Override
	public boolean maintainSilence() {
		System.out.println("Invoked maintain Silence method");		
		return true;
	}
}
