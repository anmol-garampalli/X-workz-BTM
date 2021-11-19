package com.xworkz.interfaces.Temple;

public class ArrayAmazonCart implements AmazonCartDAO {

	private CartDTO[] dtos=new CartDTO[10];
	int counter=0;
	
	@Override
	public boolean save(CartDTO cartDTO) {
		System.out.println("Invoked Add To Cart Method");
		if(cartDTO!=null && counter<dtos.length)
		{
			dtos[counter++]=cartDTO;
			return true;
		}
		return false;
	}
	
	@Override
	public CartDTO findByName(String name) {
		System.out.println("Invoked Search by name method");
		if(name!=null)
		{
			for(int i=0;i<dtos.length;i++)
			{
				CartDTO dtoRef=dtos[i];
				if(dtoRef!=null)
				{
					
				
				String nameRef=dtoRef.getName();
				
				if(name.equalsIgnoreCase(nameRef))
				{
					return dtoRef;
				}
				
				}
				else
				{
					System.out.println("null reference at index ".concat(String.valueOf(i)));
				}
			}
		}
		return null;
	}
	
	@Override
	public void displayAllCartDeatils() {
		System.out.println("Invoked Display Cart Method");
		
		for(int i=0;i<dtos.length;i++)
		{
		 CartDTO dtoRef=dtos[i];
		 if(dtoRef!=null)
		 {
		 System.out.println(dtoRef.getName());
		 System.out.println(dtoRef.getQuantity());
		 System.out.println(dtoRef.getItem());
		 System.out.println(dtoRef.getPrice());
		}
		 else
		 {
			 System.out.println("null at the index ".concat(String.valueOf(i)));
		 }
		}
		
		
	}
	
	
}


	
	
	

