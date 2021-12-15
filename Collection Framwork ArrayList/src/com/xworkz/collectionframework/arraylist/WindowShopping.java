package com.xworkz.collectionframework.arraylist;

public class WindowShopping {

	public static void main(String[] args) {
		Clothing dao = new Clothing();
		dao.save("Nike Jordan");
		dao.save("Peter England");
		dao.save("Zudio");
		dao.save("Puma");
		dao.save("VeroModa");

		boolean findMatchName = dao.findMatchName("Zudio");
		System.out.println(findMatchName);

		boolean findMatchCaseInsensitive = dao.findMatchCaseInsensitive("puma");
		System.out.println(findMatchCaseInsensitive);

		boolean findMatchStartswith = dao.findMatchStartswith("Ve");
		System.out.println(findMatchStartswith);

		boolean findMatchEndswith = dao.findMatchEndswith("ma");
		System.out.println(findMatchEndswith);

	}

}
