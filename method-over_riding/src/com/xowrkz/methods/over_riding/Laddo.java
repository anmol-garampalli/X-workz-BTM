package com.xowrkz.methods.over_riding;

public class Laddo extends Sweet {

	public Laddo() {
		System.out.println("Invoked no argument laddo constructor");
	}

	@Override
	public void sweetDetails() {
		System.out.println("Invoked Object Over-riding method");

	}

}
