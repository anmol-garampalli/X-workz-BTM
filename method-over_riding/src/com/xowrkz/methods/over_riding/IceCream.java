package com.xowrkz.methods.over_riding;

public class IceCream {
	private String flavour;
	private String brandName;

	@Override
	public String toString() {
		System.out.println("Invoked To String Method");
		return super.toString();
	}

	@Override
	public int hashCode() {
		System.out.println("Invoked Hash Code Method");
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked Equals Method");
		if (obj == null) {
			System.err.println("Error You have passed Null Value");
			return false;
		}
		if (obj instanceof IceCream) {
			System.out.println("Icecream is an instance of object");
			String converted = ((IceCream) obj).getBrandName();
			if (this.brandName.equals(converted)) {
				System.out.println("Both the names are Identical");
			}

		}

		return super.equals(obj);
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public String getBrandName() {
		return brandName;
	}

	public String setBrandName(String brandName) {
		return this.brandName = brandName;
	}

}
