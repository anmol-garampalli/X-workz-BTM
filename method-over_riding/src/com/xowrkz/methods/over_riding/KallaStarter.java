package com.xowrkz.methods.over_riding;

public class KallaStarter {

	public static void main(String[] args) {
		Kalla kalla = new Kalla();
		kalla.Robbery("Samsung");
		MobileKalla mobilekalla = new MobileKalla();
		mobilekalla.Robbery("OnePlus");

		Kalla mobile = new MobileKalla();
		mobile.Robbery("OnePlus");

		Kalla kalla2 = new Kalla("Jhandu Balm", "MobilePhone", 10, 25, "BTM Layout", 27);
		System.out.println(kalla2.getName());

	}

}