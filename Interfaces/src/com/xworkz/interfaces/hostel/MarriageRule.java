package com.xworkz.interfaces.hostel;

public interface MarriageRule {

	default boolean validAge(char Gender, int Age) {
		return true;

	}

}
