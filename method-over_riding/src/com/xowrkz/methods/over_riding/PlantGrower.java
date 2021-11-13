package com.xowrkz.methods.over_riding;

public class PlantGrower {

	public static void main(String[] args) {
		
		Plant plant=new Plant();
		Plant plant2=new Plant();
		
		System.out.println(plant.toString());
		System.out.println(plant2.hashCode());
		
		System.out.println(plant2.toString());
		System.out.println(plant2.hashCode());
		
		System.out.println(plant.setName("Nilgiri"));	
		System.out.println(plant2.setName("Neem"));
		System.out.println(plant.equals(plant2));
		
		System.out.println(PlantType.Climber);
		System.out.println(PlantType.Creeper);
		System.out.println(plant.equals(plant2));
	}

}
