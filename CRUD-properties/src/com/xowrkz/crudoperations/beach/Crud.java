package com.xowrkz.crudoperations.beach;

public class Crud {
	
	 public static String countryname = "INDIA";
	public String[] beachname = new String[5];
	
	private int counter = 0;

	public  Crud(String countame) {
		System.out.println("Invoked crud constructor");
		countryname=countame;
	}

	public String getCountryname() {
		return countryname;
	}

	public void addBeachname(String name) {
		System.out.println("Invoked addbeachname");
		System.out.println("Beach name".concat(beachname));
		if (this.counter<5) {
			
			if (this.counter < 5) {
				this.beachname[this.counter]=name;
				this.counter++;
			}
			else {
				System.err.println("Array is full");
				
			}
				
			public void displaybeachnames() {
				System.out.println("Invoked display beachnames");
				for (int choclate=0; choclate<this.beachname.length; choclate++){
					String name=this.beachname[choclate];
					System.out.println(name);
				}
				}
		}
		
		
	}

}
