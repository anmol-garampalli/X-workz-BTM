package com.xowrkz.methods.over_riding;

public class CityTravel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City city=new City();
		City city2=new City();
		
		
		System.out.println(city.setCityName("Bidar"));
		System.out.println(city2.setCityName("Bangalore"));
		System.out.println(city.equals(city2));
	
	
	}

}
