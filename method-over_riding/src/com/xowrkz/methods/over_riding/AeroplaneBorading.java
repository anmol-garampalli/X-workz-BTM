package com.xowrkz.methods.over_riding;

public class AeroplaneBorading {

	public static void main(String[] args) {
		Aeroplane aeroplane = new Aeroplane();
		Aeroplane aeroplane2 = new Aeroplane();

		System.out.println(aeroplane.setCompany("Airbus"));
		System.out.println(aeroplane2.setCompany("Boeing"));
		System.out.println(aeroplane.equals(aeroplane2));

	}

}
