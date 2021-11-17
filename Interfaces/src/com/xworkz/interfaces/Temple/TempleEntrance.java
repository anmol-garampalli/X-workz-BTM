package com.xworkz.interfaces.Temple;

public class TempleEntrance {

	public static void main(String[] args) {
	
		PublicDevotees publicdevotees = new PublicDevotees();
		TempleAssociation temple=new TempleAssociation(publicdevotees,"ISCKON");
		temple.allowDevotees();
		
		
		
		
		
	}

}
