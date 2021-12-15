package com.xworkz.collectionframework.arraylist;

public class PinCodeSearcher {

	public static void main(String[] args) {

		PincodeDAO dao = new PincodeDAO();
		dao.save("585401");
		dao.save("585101");
		dao.save("560085");
		dao.save("560059");
		dao.save("560072");

		boolean findMatchName = dao.findMatchName("585401");
		System.out.println(findMatchName);

		boolean findMatchStartswith = dao.findMatchStartswith("58");
		System.out.println(findMatchStartswith);

		boolean findMatchEndswith = dao.findMatchEndswith("72");
		System.out.println(findMatchEndswith);

	}

}
