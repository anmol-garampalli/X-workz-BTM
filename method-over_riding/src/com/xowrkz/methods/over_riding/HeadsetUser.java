package com.xowrkz.methods.over_riding;

import com.xworkz.method.overiding.november10.Headset;

public class HeadsetUser {

	public static void main(String[] args) {
		Headset headset = new Headset();
		Headset headset2 = new Headset();

		System.out.println(headset.toString());
		System.out.println(headset.hashCode());

		System.out.println(headset2.toString());
		System.out.println(headset2.hashCode());

	}

}
