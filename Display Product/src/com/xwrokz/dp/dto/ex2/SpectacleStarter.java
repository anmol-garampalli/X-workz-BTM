package com.xwrokz.dp.dto.ex2;

public class SpectacleStarter {
	public static void main(String[] args) {
		
		Spectacles spectacles=new Spectacles();
		Spectacles.getName("Lenskart Blu");
		Spectacles.getModelno("LA2007");
		Spectacles.getManufacturername("Lenskart");
		Spectacles.getPrice(1099);
		Spectacles.isMadeinindia(true);
		Spectacles.getDeliveryaddress("Kengeri,Bangalore");
		
		Spectacles spectacles02=new Spectacles("John Jacobs Light weight","JJ2001","John Jacobs",2999,true,"bidar,Karntaka");
		Spectacles spectacles03=new Spectacles("Lenskart Air","LAR01","Lenskart",1999,true,"bidar,Karntaka");
		Spectacles spectacles04=new Spectacles("Vincent Chase Air","VC11","Lenskart",999,true,"Bangalore,Karntaka");

		Spectacles[] array = new Spectacles[10];
		
		array[0]=spectacles;
		array[1]=spectacles02;
		array[2]=spectacles03;
		array[3]=spectacles04;
		
		for(int specsy=0;specsy<=array.length;specsy++) {
			
			Spectacles ref = array[specsy];
			
			if (ref != null) {
				System.out.println(ref.getName());
				System.out.println(ref.getModelno());
				System.out.println(ref.getManufacturername());
				System.out.println(ref.getPrice());
				System.out.println(ref.isMadeinindia());
				System.out.println(ref.getDeliveryaddress());
								
			}
			else {
				System.err.println("index");
			}
			
		
		
		}
			
		}

}
