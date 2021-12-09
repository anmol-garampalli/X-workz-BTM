package com.xworkz.collections.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PhoneCollection {

	public static void main(String[] args) {

		Long Phone1 = 9108222564l;
		Long Phone2 = 6360901879l;
		Long Phone3 = 8123841847l;
		Long Phone4 = 6364383686l;
		Long Phone5 = 7338442849l;
		Long Phone6 = 7086240999l;
		Long Phone7 = 9916136969l;
		Long Phone8 = 9353111028l;
		Long Phone9 = 7760137733l;
		Long Phone10 =9167244885l;

		List<Long> collection = new ArrayList<Long>();

		collection.add(Phone1);
		collection.add(Phone2);
		collection.add(Phone3);
		collection.add(Phone5);
		collection.add(Phone6);
		collection.add(Phone7);
		collection.add(Phone8);
		collection.add(Phone9);
		collection.add(Phone10);

		System.out.println("Printing the whole list");
		System.out.println(collection.size());
		Collections.sort(collection);
		System.out.println("In Ascending Order");

		Iterator<Long> itr = collection.iterator();
		while (itr.hasNext()) {
			Long type = itr.next();
			System.out.println(type);
		}

		Comparator<Long> comp = new Phonenum();
		Collections.sort(collection, comp);

		Iterator<Long> itr1 = collection.iterator();
		while (itr1.hasNext()) {
			Long type1 = itr1.next();
			System.out.println(type1);
		}
		Set<Long> set = new TreeSet<Long>();
		set.add((long) 910);
//		set.add(9876543210);
//		set.add(1234567890);

		Iterator<Long> itr2 = set.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());

		}
		Comparator<Long> compare = new Phonenum();
		Collections.sort(collection, comp);
		Iterator<Long> itr3 = collection.iterator();
		while (itr3.hasNext()) {
			Long type1 = itr3.next();
			System.out.println(type1);
		}

	}
}
