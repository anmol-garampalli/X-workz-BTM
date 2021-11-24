package com.xowrkz.crudoperations.nov24;

public class ArrayBankDetails implements BankBranchDAO {
	BankDTO[] dto = new BankDTO[10];

	int counter = 0;

	@Override
	public boolean save(BankDTO b) {
		System.out.println("Invoked Creation method");
		if (b != null && this.counter < dto.length) {
			System.out.println("You have passed a correct bank name");
			dto[this.counter++] = b;
			System.out.println("Bank Details have been saved");
			return true;
		} else {
			System.err.println("You did provide correct input,Please check again");
		}
		return false;
	}

	@Override
	public boolean display() {
		System.out.println("Created display details method");
		for (int i = 0; i < dto.length; i++) {
			if (dto[i] != null) {
				System.out.println(dto[i].getBankID());
				System.out.println(dto[i].getBankName());
				System.out.println(dto[i].getBranch());
				System.out.println(dto[i].getBankIFSC());
			} else {
				System.err.println("Array index is pointing to null location");
			}

		}
		return false;
	}

	@Override
	public boolean update(int index, BankDTO b) {
		System.out.println("Created Update method");
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
