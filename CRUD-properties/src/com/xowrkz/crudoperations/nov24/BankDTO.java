package com.xowrkz.crudoperations.nov24;

public class BankDTO {

	private String bankID;
	private String bankName;
	private String bankIFSC;
	private String Branch;
	
	public BankDTO(String bankID, String bankName, String bankIFSC, String branch) {
		super();
		this.bankID = bankID;
		this.bankName = bankName;
		this.bankIFSC = bankIFSC;
		Branch = branch;
	}

	public String getBankID() {
		return bankID;
	}

	public void setBankID(String bankID) {
		this.bankID = bankID;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankIFSC() {
		return bankIFSC;
	}

	public void setBankIFSC(String bankIFSC) {
		this.bankIFSC = bankIFSC;
	}

	public String getBranch() {
		return Branch;
	}

	public void setBranch(String branch) {
		Branch = branch;
	}
	
	
	
	
}
