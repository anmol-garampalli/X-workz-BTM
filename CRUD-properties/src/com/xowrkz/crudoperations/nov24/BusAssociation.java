package com.xowrkz.crudoperations.nov24;

public class BusAssociation {
	BusRouteDAO dao;

	public BusAssociation(BusRouteDAO dao) {
		super();
		this.dao = dao;
	}

	void saveDetails(BusDTO dto) {
		System.out.println("Created Save Details method");
		dao.save(dto);

	}

	void displayDetails() {
		dao.display();

	}

	void deleteFromIndex(int index) {
		dao.delete(index);

	}

	void updateDetails(int index, BusDTO dto) {
		dao.update(0, dto);

	}

}
