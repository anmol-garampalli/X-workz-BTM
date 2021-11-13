package com.xworkz.dp.dto3;

public class Smartphone {
	
	private String name;
	private String Companyname;
	private float price;
	private String modelno;
	private boolean madeinindia;
	private String storelocation;
	public char[] getName;
	
	public Smartphone() {
		System.out.println("Invoked no argument constructor");
	}

	public Smartphone(String name, String companyname, float price, String modelno, boolean madeinindia,
			String storelocation) {
		super();
		this.name = name;
		this.Companyname = companyname;
		this.price = price;
		this.modelno = modelno;
		this.madeinindia = madeinindia;
		this.storelocation = storelocation;
	}

	public String getName(String string) {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanyname() {
		return Companyname;
	}

	public void setCompanyname(String companyname) {
		Companyname = companyname;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getModelno(String string) {
		return modelno;
	}

	public void setModelno(String modelno) {
		this.modelno = modelno;
	}

	public boolean isMadeinindia() {
		return madeinindia;
	}

	public void setMadeinindia(boolean madeinindia) {
		this.madeinindia = madeinindia;
	}

	public String getStorelocation(String string) {
		return storelocation;
	}

	public void setStorelocation(String storelocation) {
		this.storelocation = storelocation;
	}

	public char[] getStoreLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
