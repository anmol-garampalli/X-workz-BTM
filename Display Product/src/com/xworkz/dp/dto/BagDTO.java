package com.xworkz.dp.dto;

public class BagDTO {

	private String bagName;
	private String bagBrand;
	private float price;
	private int storageCapacity;
	private String vendorName;
	private String countryOfOrigin;

	public BagDTO() {
		System.out.println("Invoked no argument constructor");
	}

	public BagDTO(String bagName, String bagBrand, float price, int storageCapacity, String vendorName,
			String countryOfOrigin) {
		super();
		this.bagName = bagName;
		this.bagBrand = bagBrand;
		this.price = price;
		this.storageCapacity = storageCapacity;
		this.vendorName = vendorName;
		this.countryOfOrigin = countryOfOrigin;
	}

	public String getBagName() {
		return bagName;
	}

	public void setBagName(String bagName) {
		this.bagName = bagName;
	}

	public String getBagBrand() {
		return bagBrand;
	}

	public void setBagBrand(String bagBrand) {
		this.bagBrand = bagBrand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getStorageCapacity() {
		return storageCapacity;
	}

	public void setStorageCapacity(int storageCapacity) {
		this.storageCapacity = storageCapacity;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

}
