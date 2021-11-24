package com.xowrkz.crudoperations.nov24;

public class AirportAssociation {
	AirportDAO dao;

	public AirportAssociation() {
		super();
		this.dao = dao;
	}

	void saveDetails() {
		System.out.println("Created save Details method");
		dao.save(dao);
	}

	void displayDetails() {
		dao.display();
	}

	void deleteFromIndex() {
		dao.delete(index); //error
	}
	void updateDetails(int index, AirportDTO dto) {
		dao.update(0, dto);

	}

	
	
	
}