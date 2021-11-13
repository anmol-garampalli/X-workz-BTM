package com.xowrkz.methods.over_riding;

public class TyreRotation {

	public static void main(String[] args) {
		Tyre tyre=new Tyre();
		Tyre tyre2=new Tyre();
		
		System.out.println(tyre.setBrand("MRF"));
		System.out.println(tyre2.setBrand("Apollo"));
		System.out.println(tyre.equals(tyre2));
		
		System.out.println(tyre.type.OffRoad);
		System.out.println(tyre2.type.OffRoad);
		System.out.println(tyre.equals(tyre2));
	}

}
