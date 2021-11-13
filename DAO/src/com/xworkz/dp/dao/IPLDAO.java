package com.xworkz.dp.dao;

import com.xworkz.dp.dto.IPLDTO;

public class IPLDAO {
	private IPLDTO[] ipldto = new IPLDTO[999];
	private int count = 0;
	
public IPLDTO[] getIpldto(){
return ipldto;	
}
	// CRUD Operation
	// Create
	public void create(IPLDTO ipldto) {
		if (ipldto != null) {
			this.ipldto[this.count++] = ipldto;
			System.out.println("Invoked create IplDTO :".concat(String.valueOf(ipldto.getTeamname())));
		} else {
			System.out.println("Either the array is full or pointing to null");
		}
	}

	public void create(IPLDTO dto, int index) { // method overloading
		if (dto != null && index > 0 && ipldto.length > index) {

			System.out.println("You can enter the team details");
			this.ipldto[index] = dto;
		} else {
			System.out.println("Array is occupied or pointing to null");
		}

	}

	public int indexOccupied() {
		System.out.println("Number of indexes occupied is ".concat(String.valueOf(count)));
		return count;

	}

	public boolean match(String teamname) {
		for (int name = 0; name < ipldto.length; name++) {

			IPLDTO ipl = this.ipldto[name];

			if (ipl != null) {
				String varcheck = ipl.getTeamname();
				System.out.println(varcheck);
				if (teamname.equals(varcheck)) {
					System.out.println("Found team name");
					return true;
				}
			}

		}
		System.out.println("Did not find the teamname");
		return false;

	}

}// end of class
