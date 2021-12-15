package com.xworkz.collectionframework.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class FruitsDAO {

	private Collection<String> fruits = new ArrayList<String>();

	public boolean save(String name) {
		return this.fruits.add(name);
	}

	public boolean findMatchName(String fruits) {
		if (fruits != null) {
			if (fruits.contains(fruits)) {
				System.out.println("Fruit name is found ");
				return true;

			}
		}
		return false;
	}

	public boolean findMatchCaseInsensitive(String name) {
		if (name != null) {
			Iterator<String> itr = fruits.iterator();
			while (itr.hasNext()) {
				String type = itr.next();

				if (type.equalsIgnoreCase(name)) {
					System.out.println("Fruit name found after ignoring Case Sensitivity " + name);
					return true;
				}
			}
		}
		return false;
	}

	public boolean findMatchStartswith(String chars) {
		if (chars != null) {
			Iterator<String> itr = fruits.iterator();
			while (itr.hasNext()) {
				String type = itr.next();
				if (type.toUpperCase().startsWith(chars.toUpperCase())) {
					System.out.println("Fruit name is found with initial characters " + chars);
					return true;
				}
			}
		}
		return false;
	}

	public boolean findMatchEndswith(String chars) {
		if (chars != null) {
			Iterator<String> itr = fruits.iterator();
			while (itr.hasNext()) {
				String type = itr.next();
				if (type.toUpperCase().endsWith(chars.toUpperCase())) {
					System.out.println("Fruit name found with ending characters= " + chars);
					return true;
				}
			}
		}
		return false;
	}
}
