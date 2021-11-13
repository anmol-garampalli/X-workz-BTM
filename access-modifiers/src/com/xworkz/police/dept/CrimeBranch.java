package com.xworkz.police.dept;

import com.xworkz.police.Police;

public class CrimeBranch extends Police {

	public CrimeBranch() {
		super();
		System.out.println("Invoked no argument constructor");
		System.out.println(super.name);
		System.out.println(super.experience);

	}

	public void testMethod() {
		System.out.println("Invoked Test Method");
		super.displayDetails();
	}

}
