package com.xworkz.collections.customdatatype;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ChoclateStarter {

	public static void main(String[] args) {
		ChoclateDTO c1 = new ChoclateDTO("Cadbury", "Toffee", 25, 250, 30.25);
		ChoclateDTO c2 = new ChoclateDTO("Diarymilk", "Candy", 45, 20, 30.55);
		ChoclateDTO c3 = new ChoclateDTO("Cadbury", "Toffee", 25, 250, 30.25);
		ChoclateDTO c4 = new ChoclateDTO("Cadbury", "Toffee", 25, 250, 30.25);
		ChoclateDTO c5 = new ChoclateDTO("Sunfeast", "Toffee", 25, 2500, 30.25);

		Set<ChoclateDTO> collection = new HashSet<ChoclateDTO>();
		collection.add(c1);
		collection.add(c2);
		collection.add(c3);
		collection.add(c4);
		System.out.println(collection.size());

		Iterator<ChoclateDTO> itr = collection.iterator();
		while (itr.hasNext()) {
			ChoclateDTO ele = itr.next();
			System.out.println(ele);
		}

	}

}
