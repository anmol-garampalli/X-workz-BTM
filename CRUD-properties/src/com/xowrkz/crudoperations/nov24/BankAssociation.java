package com.xowrkz.crudoperations.nov24;

public class BankAssociation {
	BankBranchDAO dao;

	public BankAssociation(BankBranchDAO dao) {
		super();
		this.dao = dao;
	}

	void saveDetails(BankDTO dto) {
		System.out.println("Created Save Details method");
		dao.save(dto);

	}

	void displayDetails() {
		dao.display();

	}

	void deleteFromIndex(int index) {
		dao.delete(index);

	}

	void updateDetails(int index, BankDTO dto) {
		dao.update(0, dto); //error

	}

}
