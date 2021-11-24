package com.xowrkz.crudoperations.nov24;

public class ArrayBusRoute implements BusRouteDAO {

	BusDTO[] dto = new BusDTO[10];
	int counter = 0;

	@Override
	public boolean save(BusDTO b) {
		System.out.println("Created Bus Details");
		if (b != null && this.counter < dto.length) {
			System.out.println("You have passed correct value");
			dto[this.counter++] = b;
			System.out.println("Bus details have been saved");
			return true;
			// storing the reference of bus dto to array reference of bus dto
		} else {
			System.out.println("You have passed way too many values");
			System.out.println("You have passed null value,check again");
		}
		return false;
	}

	@Override
	public boolean display() {
		System.out.println("Created display method");
		for (int i = 0; i < dto.length; i++) {
			if (dto[i] != null) {
				System.out.println(dto[i].getBusId());
				System.out.println(dto[i].getBusPoint());
				System.out.println(dto[i].getDestination());
				System.out.println(dto[i].getDriverName());
				return true;
			} else {
				System.out.println("Array is pointing to null index" + i);
			}
		}

		return false;
	}

	@Override
	public boolean update(int index, BusDTO b) {
		System.out.println("Method to update value in array using index");
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
		System.out.println("Created method to delete index in array");

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
