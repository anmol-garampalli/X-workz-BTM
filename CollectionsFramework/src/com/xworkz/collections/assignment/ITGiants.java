package com.xworkz.collections.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ITGiants {

	public static void main(String[] args) {
		List<String> collection = new ArrayList<String>();
		collection.add("Infosys");
		collection.add("Wipro");
		collection.add("Capgemini");
		collection.add("TCS");
		collection.add("Genpact");
		collection.add("Tech Mahindra");
		collection.add("Accenture");

		System.out.println("LIST");
		System.out.println(collection.size());
		Collections.sort(collection);
		System.out.println("In Ascending Order");

		Iterator<String> itr = collection.iterator();
		while (itr.hasNext()) {
			String type = itr.next();
			System.out.println(type);

		}

		System.out.println("In Descending Order");

		Comparator<String> comp = new Giant1();
		Collections.sort(collection, comp);

		Iterator<String> itr1 = collection.iterator();

		while (itr1.hasNext()) {
			String type = itr1.next();
			System.out.println(type);
		}
		System.out.println("Set method");
		Set<String> set1 = new TreeSet<String>();
		set1.add("Infosys");
		set1.add("Wipro");
		set1.add("Capgemini");
		set1.add("TCS");
		set1.add("Genpact");
		set1.add("Tech Mahindra");
		set1.add("Accenture");

		System.out.println(set1.size());
		System.out.println("In Ascending order");

		Iterator<String> itr2 = set1.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		System.out.println("In Descending Order");

		// Collections.sort(collection, Collections.reverseOrder());

		Comparator<String> comp1 = new Giant1();
		Collections.sort(collection, comp1);
		Iterator<String> itr3 = collection.iterator();
		while (itr3.hasNext()) {
			String type1 = itr3.next();
			System.out.println(type1);
		}

	}
}
