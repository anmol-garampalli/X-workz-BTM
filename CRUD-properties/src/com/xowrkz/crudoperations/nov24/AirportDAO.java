package com.xowrkz.crudoperations.nov24;

public interface AirportDAO {

	boolean save(AirportDAO  dao); 	//create
	boolean display(); //read
	boolean update(int index,AirportDTO a);	//update
	boolean delete(int index); //delete
	
	
	
	
}
