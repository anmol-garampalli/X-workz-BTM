package com.xowrkz.crudoperations.nov24;

public class AirportDeparture {

	public static void main(String[] args) {
		System.out.println("Created main method");

		AirportDTO dto = new AirportDTO("KA01", "KIA", "Bangalore", "International");

		AirportDAO dao = new ArrayAirportRoute();

		AirportAssociation association = new AirportAssociation();
		association.saveDetails(); // error

		association.deleteFromIndex();
		association.displayDetails();

		association.updateDetails(4, dto);

	}

}
