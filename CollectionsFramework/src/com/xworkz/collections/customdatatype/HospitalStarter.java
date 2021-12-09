package com.xworkz.collections.customdatatype;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HospitalStarter { //Had an error but resolve after generating toString method

	public static void main(String[] args) {
		HospitalDTO h1 = new HospitalDTO("Jaydeva", "Bannerughatta Road", "Cardiology", 100);
		HospitalDTO h2 = new HospitalDTO("Sanjay Gandhi", "Jayanagar", "Government", 200);
		HospitalDTO h4 = new HospitalDTO("Indira Gandhi", "Jayanagar", "Government", 250);
		HospitalDTO h3 = new HospitalDTO("Jaydeva", "Bannerughatta Road", "Cardiology", 100);

		Set<HospitalDTO> collections = new HashSet<HospitalDTO>();

		collections.add(h1);
		collections.add(h2);
		collections.add(h3);
		collections.add(h4);
		System.out.println(collections.size());

		Iterator<HospitalDTO> itr = collections.iterator();
		while (itr.hasNext()) {
			HospitalDTO ele = itr.next();
			System.out.println(ele);
		}

	}

}
