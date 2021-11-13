package com.xowrkz.methods.over_riding;

public class Shoe {
	private String shoeName;
	private int size;

	public String getShoeName() {
		return shoeName;
	}

	public void setShoeName(String shoeName) {
		this.shoeName = shoeName;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		System.out.println("Invoked To String Method");
		return super.toString();
	}

	@Override
	public int hashCode() {
		System.out.println("Invoked HashCode Method");
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked Equals Method");
		return super.equals(obj);
	}

}
