package com.xworkz.collections.assignment;

import java.util.Comparator;

public class Phonenum implements Comparator<Long> {

	@Override
	public int compare(Long o2, Long o1) {
		return o2.compareTo(o1);
	}

}
