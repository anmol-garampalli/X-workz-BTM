package com.xworkz.collectionframework.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PlacesDAO {

	private Collection<String> places = new ArrayList<String>();

	public boolean save(String name) {
		return this.places.add(name);
	}

	public boolean findMatchName(String place) {
		if (place != null) {
			if (places.contains(place)) {
				System.out.println("Your City is found");
				return true;

			}
		}
		return false;
	}

	public boolean findMatchCaseInsensitive(String name) {
		if (name != null) {
			Iterator<String> itr = places.iterator();
			while (itr.hasNext()) {
				String type = itr.next();

				if (type.equalsIgnoreCase(name)) {
					System.out.println("Your city is found after ignoring case-sensitivity");
					return true;
				}
			}
		}
		return false;
	}

	public boolean findMatchStartswith(String chars) {
		if (chars != null) {
			Iterator<String> itr = places.iterator();
			while (itr.hasNext()) {
				String type = itr.next();
				if (type.toUpperCase().startsWith(chars.toUpperCase())) {
					System.out.println("Your city name is found with starting characters");
					return true;
				}
			}
		}
		return false;
	}

	public boolean findMatchEndswith(String chars) {
		if (chars != null) {
			Iterator<String> itr = places.iterator();
			while (itr.hasNext()) {
				String type = itr.next();
				if (type.toUpperCase().endsWith(chars.toUpperCase())) {
					System.out.println("place is matched ends with same chars");
					return true;
				}
			}
		}
		return false;
	}
}
