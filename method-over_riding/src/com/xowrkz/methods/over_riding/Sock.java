package com.xowrkz.methods.over_riding;

import com.xworkz.method.overiding.november10.Watch;

public class Sock {
	private String brandName;
	private int length;

	@Override
	public String toString() {
		System.out.println("Invoked To String Method");
		return super.toString();
	}

	@Override
	public int hashCode() {
		System.out.println("Invoked Hashcode Method");
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked Equals Method");
		if (obj == null) {
			System.out.println("You have passed null value, Check again");
			return false;
		}
		if (obj instanceof Watch) {
			System.out.println("Sock is an instance of sock");
			String suck = ((Sock) obj).getBrandName();
			if (this.brandName.equals(suck)) {
				System.out.println("Both of them are identical");

			}

		}

		return super.equals(obj);
	}

	public String getBrandName() {
		return brandName;
	}

	public String setBrandName(String brandName) {
		return this.brandName = brandName;
	}

	public int getLength() {
		return length;
	}

	public String setLength(int length) {
		this.length = length;
		return brandName;
	}

}
