package com.xworkz.police.dept;

import com.xworkz.police.Police;

public class TrafficPolice extends Police {

	public TrafficPolice() {
		super();
		System.out.println("Invoked no argument constructor");
		System.out.println(super.name);
		System.out.println(super.designation);
		System.out.println(super.experience);
		System.out.println(super.noOfStars);
		System.out.println(super.department);

	}
}
