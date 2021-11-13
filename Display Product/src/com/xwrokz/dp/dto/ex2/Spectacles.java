package com.xwrokz.dp.dto.ex2;

public class Spectacles {
	private String name;
	private String modelno;
	private String manufacturername;
	private int price;
	private boolean madeinindia;
	private String deliveryaddress;
	
	public Spectacles() {
		System.out.println("Invoked no-argument constructor");
	}

	public Spectacles(String name, String modelno, String manufacturername, int price, boolean madeinindia,
			String deliveryaddress) {
		super();
		this.name = name;
		this.modelno = modelno;
		this.manufacturername = manufacturername;
		this.price = price;
		this.madeinindia = madeinindia;
		this.deliveryaddress = deliveryaddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModelno() {
		return modelno;
	}

	public void setModelno(String modelno) {
		this.modelno = modelno;
	}

	public String getManufacturername() {
		return manufacturername;
	}

	public void setManufacturername(String manufacturername) {
		this.manufacturername = manufacturername;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isMadeinindia() {
		return madeinindia;
	}

	public void setMadeinindia(boolean madeinindia) {
		this.madeinindia = madeinindia;
	}

	public String getDeliveryaddress() {
		return deliveryaddress;
	}

	public void setDeliveryaddress(String deliveryaddress) {
		this.deliveryaddress = deliveryaddress;
	}
	
	

}
