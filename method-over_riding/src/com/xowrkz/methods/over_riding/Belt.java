package com.xowrkz.methods.over_riding;

public class Belt {
	private String materialType;
	private String usage;

	@Override
	public String toString() {
		System.out.println("Invoked To String Method");
		return super.toString();
	}

	@Override
	public int hashCode() {
		System.out.println("Invoked hashcode Method");
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals Method");
		return super.equals(obj);
	}

	public String getMaterialType() {
		return materialType;
	}

	public String setMaterialType(String materialType) {
		return this.materialType = materialType;
	}

	public String getUsage() {
		return usage;
	}

	public void setUsage(String usage) {
		this.usage = usage;
	}

}
