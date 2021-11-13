package com.xowrkz.methods.over_riding;

public class FinalizeMethod {
	public FinalizeMethod() {
		System.out.println("Invoked no argument Constructor");
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Invoked Finalize Method");
		super.finalize();
	}

	public void Sound() {
		System.out.println("Invoked Sound Method");
	}
}
