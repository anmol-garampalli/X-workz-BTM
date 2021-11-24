package com.xowrkz.crudoperations.nov24;

public interface BusRoute {
	
	boolean save(BusDTO b); 	//create
	boolean display(); //read
	boolean update(int index,BusDTO b);	//update
	boolean delete(int index); //delete
	

}
