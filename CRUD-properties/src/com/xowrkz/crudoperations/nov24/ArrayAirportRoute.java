package com.xowrkz.crudoperations.nov24;

public class ArrayAirportRoute implements AirportDAO {

	AirportDTO[] dto = new AirportDTO[10];
	int counter = 0;

	@Override
	public boolean save(AirportDTO dto) { //error
		System.out.println("Created Airport Save method");
		return false;
	}

	@Override
	public boolean display() {
		System.out.println("Created Airport save Method");
		return false;
	}

	@Override
	public boolean update(int index, AirportDTO a) {
		System.out.println("Create Airport details method");
		return false;
	}

	@Override
	public boolean delete(int index) {
		System.out.println("Created airport delete Method");
		return false;
	}



}
