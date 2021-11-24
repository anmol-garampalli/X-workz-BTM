package com.xowrkz.crudoperations.nov24;

public class BankTransaction {

	public static void main(String[] args) {
		System.out.println("Created main method");

		BankDTO dto = new BankDTO("KAGB2211", "Karnataka Gramin Bank", "KAGB1122", "BIDAR");

		BankBranchDAO dao = new ArrayBankDetails();

		BankAssociation association = new BankAssociation(dao);
		association.saveDetails(dao);// error

		association.deleteFromIndex(4);
		association.displayDetails();

		association.updateDetails(4, dto);

	}

}
