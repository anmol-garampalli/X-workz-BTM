package com.xworkz.collections.customdatatype;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PoliceStationStarter {

	public static void main(String[] args) {

		PolicsStationDTO dto1 = new PolicsStationDTO("MICO Layut", "Mico Layout", "Civil", 15);
		PolicsStationDTO dto2 = new PolicsStationDTO("Chamrajpet", "Chamrajpet", "Traffic", 10);
		PolicsStationDTO dto3 = new PolicsStationDTO("Domlur", "Domlur", "Crime", 25);
		PolicsStationDTO dto4 = new PolicsStationDTO("Kormangala", "Kormangala", "Civil", 25);
		PolicsStationDTO dto5 = new PolicsStationDTO("MICO Layut", "Mico Layout", "Civil", 15);
		
		Set<PolicsStationDTO> collectionss = new HashSet<PolicsStationDTO>();

		collectionss.add(dto1);
		collectionss.add(dto2);
		collectionss.add(dto3);
		collectionss.add(dto4);
		collectionss.add(dto5);
		System.out.println(collectionss.size());
		
		Iterator<PolicsStationDTO> itr = collectionss.iterator();
		while (itr.hasNext()) {
			PolicsStationDTO ele = itr.next();
			System.out.println(ele);
		}

	}

}
