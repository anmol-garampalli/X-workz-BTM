package com.xworkz.dp;

import com.xworkz.dp.dao.IPLDAO;
import com.xworkz.dp.dto.IPLDTO;

public class IPLStarter {

	public static void main(String[] args) {

		IPLDAO ipldao = new IPLDAO();
		ipldao.create(new IPLDTO("KKR", 24, "Anmol", "vandana", "kolkata"));
		ipldao.create(new IPLDTO("RCB", 25, "Gomtesh", "UB", "Bangalore"));

		IPLDTO[] array = ipldao.getIpldto();
		for (int beer = 0; beer < array.length; beer++) {
			IPLDTO ipldto = array[beer];
			if (ipldto != null) {
				System.out.println(ipldto.getTeamname());
				System.out.println(ipldto.getOwnername());
				System.out.println(ipldto.getHomeground());
				System.out.println(ipldto.getSponsorname());
				System.out.println(ipldto.getTeamsize());

			} else {
				System.err.println("Either array is full or pointing to null");
			}
		}

	}

}
