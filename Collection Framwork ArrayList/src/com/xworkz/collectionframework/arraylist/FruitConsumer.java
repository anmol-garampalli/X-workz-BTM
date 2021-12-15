package com.xworkz.collectionframework.arraylist;

public class FruitConsumer {

	public static void main(String[] args) {

		FruitsDAO dao = new FruitsDAO();
		dao.save("Apple");
		dao.save("Mausambi");
		dao.save("Lemon");
		dao.save("Kiwi");
		dao.save("DragonFruit");

		boolean findMatchName = dao.findMatchName("Apple");
		System.out.println(findMatchName);

		boolean findMatchCaseInsensitive = dao.findMatchCaseInsensitive("MAUSAMBI");
		System.out.println(findMatchCaseInsensitive);

		boolean findMatchStartswith = dao.findMatchStartswith("ki");
		System.out.println(findMatchStartswith);

		boolean findMatchEndswith = dao.findMatchEndswith("it");
		System.out.println(findMatchEndswith);

	}

}
