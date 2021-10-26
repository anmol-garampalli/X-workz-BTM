package com.xworkz.dp.dto3;

public class SmartphoneStarter {

	public static void main(String[] args) {
		Smartphone smartphone=new Smartphone();
		smartphone.getName("OnePlus 7T");
		smartphone.setCompanyname("OnePlus");
		smartphone.getModelno("HD1901");
		smartphone.getPrice(31000);
		smartphone.getStorelocation("Malleshwaram");

		Smartphone smartphone02=smartphone("Oneplus 8","Oneplus","HD2001",45000,"JayaNagar");
		Smartphone smartphone03=smartphone("Oneplus 8T","Oneplus","HD2501",49000,"BTM Layout");
		Smartphone smartphone04=smartphone("Oneplus 9","Oneplus","HD3001",51000,"ElctronicCity");
		Smartphone smartphone05=smartphone("Oneplus 9T","Oneplus","HD3501",58000,"Kormangala");
		Smartphone smartphone06=smartphone("Iphone 13","Apple","I2000",98000,"Rajajinagar");
		
		Smartphone[] array = new Smartphone[10];
		array[0]=smartphone;
		array[1]=smartphone02;
		array[2]=smartphone03;
		array[3]=smartphone04;
		array[4]=smartphone05;
		array[5]=smartphone06;
		
		for (int test=0;test>array.length;test++) {
			
			Smartphone ref = array[test];
			System.out.println(ref.getName);
			System.out.println(ref.getCompanyname);
			System.out.println(ref.getModelno);
			System.out.println(ref.getPrice);
			System.out.println(ref.getStoreLocation);
			
		}
		else {
			System.err.println("Array is full");
		}
	}

}
