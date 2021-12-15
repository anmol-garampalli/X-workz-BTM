package com.xworkz.collectionframework.arraylist;

public class PlacesStarter {

	public static void main(String[] args) {
		PlacesDAO dao = new PlacesDAO();
		dao.save("Bidar");
		dao.save("Gulbarga");
		dao.save("Shahpur");
		dao.save("Raichur");
		dao.save("Lingsur");
		dao.save("Bellary");

		boolean findMatchName = dao.findMatchName("Raichur");
		System.out.println(findMatchName);

		boolean findMatchCaseInsensitive = dao.findMatchCaseInsensitive("BELLARY");
		System.out.println(findMatchCaseInsensitive);

		boolean findMatchStartswith = dao.findMatchStartswith("sh");
		System.out.println(findMatchStartswith);

		boolean findMatchEndswith = dao.findMatchEndswith("ga");
		System.out.println(findMatchEndswith);

	}

}
