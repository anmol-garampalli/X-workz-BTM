package com.xworkz.collections.customdatatype;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ArmyStarter {

	public static void main(String[] args) {
		ArmyDTO dto1 = new ArmyDTO("Indian Army", "Jammu and Kashmir", "Land", "Anti-Terror", 100);
		ArmyDTO dto2 = new ArmyDTO("Indian Navy", "Chennai", "Land", "Anti-Terror", 100);
		ArmyDTO dto3 = new ArmyDTO("Indian Marine Army", "Pondicherry", "Sea", "Defense", 100);
		ArmyDTO dto4 = new ArmyDTO("Indian AirForce", "Bidar", "Land", "Anti-Terror", 100);
		ArmyDTO dto5 = new ArmyDTO("Indian Army", "Jammu and Kashmir", "Land", "Anti-Terror", 100);

		Set<ArmyDTO> collection = new HashSet<ArmyDTO>();
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		System.out.println(collection.size());

		Iterator<ArmyDTO> itr = collection.iterator();
		while (itr.hasNext()) {
			ArmyDTO ele = itr.next();
			System.out.println(ele);
		}

	}

}
