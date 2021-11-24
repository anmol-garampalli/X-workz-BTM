package com.xowrkz.crudoperations.nov24;

public class BusTravel {

	public static void main(String[] args) {
		System.out.println("Main Method");
		
		BusDTO dto=new BusDTO("375", "Kengeri", "Banashankari", "Veerendra"); //save 
		BusDTO dto1=new BusDTO("376", "Kengeri", "Banashankari", "Veerendra");
		BusDTO dto2=new BusDTO("377", "Kengeri", "Banashankari", "Veerendra");
		BusDTO dto3=new BusDTO("378", "Kengeri", "Banashankari", "Veerendra");
		BusDTO dto4=new BusDTO("379", "Kengeri", "Banashankari", "Veerendra");
		BusDTO dto5=new BusDTO("380", "Kengeri", "Banashankari", "Veerendra");
		BusDTO dto6=new BusDTO("381", "Kengeri", "Banashankari", "Veerendra");
		BusDTO dto7=new BusDTO("382", "Kengeri", "Banashankari", "Veerendra");
		BusDTO dto8=new BusDTO("383", "Kengeri", "Banashankari", "Veerendra");
		BusDTO dto9=new BusDTO("384", "Kengeri", "Banashankari", "Veerendra");
		
		BusRouteDAO dao = new ArrayBusRoute();
		
		BusAssociation association = new BusAssociation(dao);
		association.saveDetails(dto);
		association.saveDetails(dto1);
		association.saveDetails(dto2); //display
		association.saveDetails(dto3);
		association.saveDetails(dto4);
		association.saveDetails(dto5);
		association.saveDetails(dto6);
		association.saveDetails(dto7);
		association.saveDetails(dto8);
		association.saveDetails(dto9);
		association.displayDetails();
		
		association.deleteFromIndex(4);
		association.displayDetails();
		
		association.updateDetails(4,dto2);
		
		
		
		
	}
	
	

}
