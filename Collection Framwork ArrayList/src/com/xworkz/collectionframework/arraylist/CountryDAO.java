package com.xworkz.collectionframework.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CountryDAO {

	private Collection<String> country = new ArrayList<String>();

	public boolean save(String name) {
		return this.country.add(name);
	}

	public boolean findMatchName(String country) {
		if (country != null) {
			if (country.contains(country)) {
				System.out.println("Country name is found =" + country);
				return true;

			}
		}
		return false;

	}

	public boolean findMatchCaseInsensitive(String name) {
		if (name != null) {
			Iterator<String> itr = country.iterator();
			while (itr.hasNext()) {
				String type = itr.next();

				if (type.equalsIgnoreCase(name)) {
					System.out.println("Country name is found after Ignoring cases " + name);
					return true;
				}
			}
		}
		return false;
	}

	public boolean findMatchStartswith(String chars) {
		if (chars != null) {
			Iterator<String> itr = country.iterator();
			while (itr.hasNext()) {
				String type = itr.next();
				if (type.toUpperCase().startsWith(chars.toUpperCase())) {
					System.out.println("Country name is found with Initial characters= "+chars);
					return true;
				}
			}
		}
		return false;
	}

	public boolean findMatchEndswith(String chars) {
		if (chars != null) {
			Iterator<String> itr = country.iterator();
			while (itr.hasNext()) {
				String type = itr.next();
				if (type.toUpperCase().endsWith(chars.toUpperCase())) {
					System.out.println("Country name is found with ending characters=" + chars);
					return true;
				}
			}
		}
		return false;
	}
}