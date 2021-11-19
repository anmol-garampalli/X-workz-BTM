package com.xworkz.interfaces.Temple;

public interface AmazonCartDAO {

	boolean save(CartDTO cartDTO);
	CartDTO findByName(String name);
	void displayAllCartDeatils();
	
	
	
}
