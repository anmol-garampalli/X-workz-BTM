package com.xworkz.interfaces.Temple;

public class AmazonOrderStarter {

	public static void main(String[] args) {
		CartDTO cartDTORef=new CartDTO("gadgets",2,2000.7f,"ear_phones");
		AmazonCartDAO amzonCartDAORef=new ArrayAmazonCart();
		AmazonBusiness business=new AmazonBusiness(amzonCartDAORef);
		business.saveCart(cartDTORef);
		business.findCartByName(null);
		business.displayCart();

	}

}
