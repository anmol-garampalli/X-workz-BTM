package com.xworkz.collections.assignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Developers {

	public static void main(String[] args) {

		List<String> collection = new ArrayList<String>();
		collection.add("Anmol");
		collection.add("Shreyas");
		collection.add("Shivsai");
		collection.add("Renu");
		collection.add("Mushtaq");
		collection.add("Abhijeet");

		System.out.println("List");
		System.out.println(collection.size());
		Collections.sort(collection); // error
		System.out.println("In Ascending order");

		Iterator<String> itr = collection.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();

		}
		System.out.println("In descending order");
		Comparator<String> comp = new Developers1();
		Collections.sort(collection, comp);//error

		Iterator<String> itr1 = collection.iterator();

		while (itr1.hasNext()) {
			String string = (String) itr1.next();
			System.out.println(string);

		}
		System.out.println("----------");

		Set<String> set1 = new TreeSet<String>();
		set1.add("Anmol");
		set1.add("Shreyas");
		set1.add("Shivsai");
		set1.add("Renu");
		set1.add("Mushtaq");

		System.out.println(set1.size());
		System.out.println("Ascending order");

		Iterator<String> itr2 = set1.iterator();
		while (itr2.hasNext()) {
			String string = (String) itr2.next();

		}

		System.out.println("Descending order");

		Comparator<String> comp1 = new Developers1();
		Collections.sort(collection, comp1); //error
		Iterator<String> itr3 = collection.iterator();
		while (itr3.hasNext()) {
			String string = (String) itr3.next();
			System.out.println(string);

		}
	}

}
