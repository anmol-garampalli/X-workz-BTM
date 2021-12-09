package com.xworkz.collections.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Product {

	public static void main(String[] args) {

		List<String> collection = new ArrayList<String>();

		collection.add("Wrky.ai");
		collection.add("Boston Dynamics");
		collection.add("Razorpay");
		collection.add("Keka HR");
		collection.add("Foreign Admits");
		collection.add("Zepto");
		collection.add("Paytm");
		collection.add("Meesho");
		collection.add("Bounce");
		collection.add("DarwinBox");

		System.out.println("List");
		System.out.println(collection.size());
		Collections.sort(collection);
		System.out.println("In Ascending Order");

		Iterator<String> itr = collection.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println(string);
		}
		System.out.println("In descending order");
		Comparator<String> comp = new Product1();
		Collections.sort(collection, comp);

		Iterator<String> itr2 = collection.iterator();
		while (itr2.hasNext()) {
			String string = (String) itr2.next();
			System.out.println(itr2);
		}
		Set<String> set1 = new TreeSet<String>();
		set1.add("Wrky.ai");
		set1.add("Razorpay");
		set1.add("Wrky.ai");
		set1.add("Boston Dynamics");
		set1.add("Razorpay");
		set1.add("Keka HR");
		set1.add("Foreign Admits");
		set1.add("Zepto");
		set1.add("Paytm");
		set1.add("Meesho");
		set1.add("Bounce");
		set1.add("DarwinBox");

		System.out.println(set1.size());
		System.out.println("In Ascending order");

		Iterator<String> itr21 = set1.iterator();
		while (itr21.hasNext()) {
			System.out.println(itr21.next());
		}

		System.out.println("In descending order");

		Comparator<String> comp1 = new Product1();
		Collections.sort(collection, comp1);
		Iterator<String> itr3 = collection.iterator();
		while (itr3.hasNext()) {
			String type1 = itr3.next();
			System.out.println(type1);

		}

	}

}
