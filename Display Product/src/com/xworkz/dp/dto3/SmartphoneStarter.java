package com.xworkz.dp.dto3;

public class SmartphoneStarter {

	public static void main(String[] args) {
		Smartphone smartphone = new Smartphone();
		smartphone.setName("OnePlus 7T");
		smartphone.setCompanyname("OnePlus");
		smartphone.setModelno("HD1901");
		smartphone.setPrice(31000);
		smartphone.setStorelocation("Malleshwaram");

		Smartphone smartphone02 = new Smartphone("Oneplus 8", "Oneplus", 45000.0f, "HD2001", true,"Bangalore");
		Smartphone smartphone03 = new Smartphone("Oneplus 8T", "Oneplus", 49000.0f, "HD2501",true, "BTM Layout");
		Smartphone smartphone04 = new Smartphone("Oneplus 9", "Oneplus", 51000.0f, "HD3001",false,"ShivajiNagar");
		Smartphone smartphone05 = new Smartphone("Oneplus 9T", "Oneplus", 55000.0f, "HD3501",true, "Kormangala");
		Smartphone smartphone06 = new Smartphone("Iphone 13", "Apple", 100000.0f,"IAP200",true, "Rajajinagar");

		Smartphone[] array = new Smartphone[10];
		array[0] = smartphone;
		array[1] = smartphone02;
		array[2] = smartphone03;
		array[3] = smartphone04;
		array[4] = smartphone05;
		array[5] = smartphone06;

		

			for (int test = 0; test < array.length; test++) {

				Smartphone ref = array[test];
				
				if(ref!=null) {
				//System.out.println(ref.getName(null));
				System.out.println(ref.getCompanyname());
				System.out.println(ref.getModelno("HD1901"));
				System.out.println(ref.getPrice());
				System.out.println(ref.getStoreLocation());

			}else
			{
				System.err.println("Array is full");
			}
		}
			
System.out.println("anmol");
	}
}
