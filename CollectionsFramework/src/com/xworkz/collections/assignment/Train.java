package com.xworkz.collections.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Train {

	public static void main(String[] args) {

		List<String> collection = new ArrayList<String>();
		collection.add("16572");
		collection.add("16573");
		collection.add("16574");
		collection.add("08253");
		collection.add("12345");
		collection.add("08654");

		System.out.println("List");
		System.out.println(collection.size());
		Collections.sort(collection);
		System.out.println("In Ascending order");

		Iterator<String> itr = collection.iterator();
		while (itr.hasNext()) {
			String type = itr.next();
			System.out.println(type);

		}
		System.out.println("In descending prder");
		Comparator<String> comp = new Train1();
		Collections.sort(collection, comp);

		Iterator<String> itr1 = collection.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		System.out.println("Set method");
		Set<String> set1 = new TreeSet<String>();
		set1.add("16572");
		set1.add("16573");
		set1.add("16583");

		System.out.println(set1.size());
		System.out.println("In Ascending order");

		Iterator<String> itr2 = set1.iterator();
		while (itr2.hasNext()) {
			String string = (String) itr2.next();

		}
		Comparator<String> comp1 = new Train1();
		Collections.sort(collection, comp1);
		Iterator<String> itr3 = collection.iterator();
		while (itr3.hasNext()) {
			String type1 = itr3.next();
			System.out.println(type1);
		}

	}

}
