package com.xworkz.crud;

public class CrudStarter {

	public static void main(String[] args) {
		BeachOperator beachoperator=new BeachOperator(); //what is the use of new keyword elaborate in detail
		String countryname=beachoperator.getCountry();
		System.out.println(countryname);
		
		beachoperator.addBeachName("Anmol Island"); //why we use double quotes
		beachoperator.displayBeachNames();
		
		beachoperator.addBeachName("Baga Beach");
		beachoperator.displayBeachNames(); //what is this statement called
		beachoperator.addBeachName("Malpe Beach");
		beachoperator.displayBeachNames();
		beachoperator.addBeachName("Calgunte Beach");
		beachoperator.displayBeachNames();
	}

}
