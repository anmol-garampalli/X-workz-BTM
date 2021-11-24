package com.xowrkz.crudoperations.nov24;

public interface BusRouteDAO {
	
	boolean save(BusDTO b); 	//create
	boolean display(); //read
	boolean update(int index,BusDTO b);	//update
	boolean delete(int index); //delete
	

}
