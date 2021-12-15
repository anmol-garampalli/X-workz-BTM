package com.xworkz.collectionframework.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PincodeDAO {

	private Collection<String> pincode = new ArrayList<String>();

	public boolean save(String name) {
		return this.pincode.add(name);
	}

	public boolean findMatchName(String pincode) {
		if (pincode != null) {
			if (pincode.contains(pincode)) {
				System.out.println("PinCode is Found " + pincode);
				return true;

			}
		}
		return false;
	}

	public boolean findMatchStartswith(String chars) {
		if (chars != null) {
			Iterator<String> itr = pincode.iterator();
			while (itr.hasNext()) {
				String type = itr.next();
				if (type.toUpperCase().startsWith(chars.toUpperCase())) {
					System.out.println("PinCode is found with starting characters " + chars);
					return true;
				}
			}
		}
		return false;
	}

	public boolean findMatchEndswith(String chars) {
		if (chars != null) {
			Iterator<String> itr = pincode.iterator();
			while (itr.hasNext()) {
				String type = itr.next();
				if (type.toUpperCase().endsWith(chars.toUpperCase())) {
					System.out.println("PinCode is found with ending characters " + chars);
					return true;
				}
			}
		}
		return false;
	}
}
