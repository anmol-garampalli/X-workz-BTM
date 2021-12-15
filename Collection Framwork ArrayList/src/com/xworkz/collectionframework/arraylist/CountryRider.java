package com.xworkz.collectionframework.arraylist;

public class CountryRider {

	public static void main(String[] args) {

		CountryDAO dao = new CountryDAO();
		dao.save("India");
		dao.save("Spain");
		dao.save("Belgium");
		dao.save("Sweden");
		dao.save("Latvia");

		boolean findMatchName = dao.findMatchName("India");
		System.out.println(findMatchName);

		boolean findMatchCaseInsensitive = dao.findMatchCaseInsensitive("SPAIN");
		System.out.println(findMatchCaseInsensitive);

		boolean findMatchStartswith = dao.findMatchStartswith("la");
		System.out.println(findMatchStartswith);

		boolean findMatchEndswith = dao.findMatchEndswith("um");
		System.out.println(findMatchEndswith);

	}

}
