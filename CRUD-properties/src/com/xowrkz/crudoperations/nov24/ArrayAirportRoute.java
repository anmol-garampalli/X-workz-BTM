package com.xowrkz.crudoperations.nov24;

public class ArrayAirportRoute implements AirportDAO {

	AirportDTO[] dto = new AirportDTO[10];
	int counter = 0;

	@Override
	public boolean saveDetails(AirportDTO dto) { // error
		System.out.println("Created Airport Save method");
		System.out.println("Created Airport Details");
		if (dto != null && this.counter < dto.length) { // error
			System.out.println("You have passed correct value");
			dto[this.counter++] = dto; //error
			System.out.println("Bus details have been saved");
			return true;
		}

		return false;
	}

	@Override
	public boolean display() {
		System.out.println("Created Airport save Method");
		for (int i = 0; i < dto.length; i++) {
			if (dto[i] != null) {
				System.out.println(dto[i].getAirportID());
				System.out.println(dto[i].getAirportName());
				System.out.println(dto[i].getLocation());
				System.out.println(dto[i].getType());
				return true;
			} else {
				System.out.println("Array is pointing to null index" + i);
			}
		}

		return false;
	}

	@Override
	public boolean update(int index, AirportDTO a) {
		System.out.println("Create Airport details method");
		if (index >= 0 && index < dto.length) {
			dto[index] = null;
			System.err.println("updated at index " + index);
			return true;
		} else {
			System.err.println("Cannot update");

		}
		return false;
	}

	@Override
	public boolean delete(int index) {
		System.out.println("Created airport delete Method");

		if (index >= 0 && index < dto.length) {
			dto[index] = null;
			System.err.println("deleted at index " + index);
			return true;
		} else {
			System.err.println("Cannot delete");

		}
		return false;
	}
}
