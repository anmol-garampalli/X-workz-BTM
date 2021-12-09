package com.xworkz.collections.customdatatype;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class OfficeStarter {

	public static void main(String[] args) {
		OfficeDTO dto1 = new OfficeDTO("Wrky", "Bangalore", 6, 7);
		OfficeDTO dto2 = new OfficeDTO("ForeignAdmits", "HSR Layout", 10, 12);
		OfficeDTO dto3 = new OfficeDTO("Wrky", "Bangalore", 6, 7);
		OfficeDTO dto4 = new OfficeDTO("KekaHR", "Hyderabad", 257, 300);
		OfficeDTO dto5 = new OfficeDTO("Bhive", "HSR", 100, 5000);
		OfficeDTO dto6 = new OfficeDTO("KekaHR", "Hyderabad", 257, 300);

		Set<OfficeDTO> collections = new HashSet<OfficeDTO>();
		collections.add(dto1);
		collections.add(dto2);
		collections.add(dto3);
		collections.add(dto4);
		collections.add(dto5);
		collections.add(dto6);
		System.out.println(collections.size());

		Iterator<OfficeDTO> itr = collections.iterator();
		while (itr.hasNext()) {
			OfficeDTO office = itr.next();
			System.out.println(office);
			
			
			

		}

	}

}
