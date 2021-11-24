package com.xowrkz.crudoperations.nov24;

public interface BankBranchDAO {

	boolean save(BankDTO b); 	//create
	boolean display(); //read
	boolean update(int index,BankDTO b);	//update
	boolean delete(int index); //delete
	
	
	
}
