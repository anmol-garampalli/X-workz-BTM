package com.xworkz.collections.assignment;

import java.util.Comparator;

public class Developers1 implements Comparator<String> {
	@Override
	public int compare(String arg0, String arg1) {
		return arg0.compareTo(arg1);
	}

}
