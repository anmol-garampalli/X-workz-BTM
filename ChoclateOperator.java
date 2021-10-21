package com.xworkz.crud.choclate;

public class ChoclateOperator {
	private String brand = new String();
	private String[] choclatename = new String[4];
	private int count;

	public ChoclateOperator() {
		this("Cadbury");
		System.out.println("Initialized no argument constructor");
	}

	public ChoclateOperator(String string) {
		// TODO Auto-generated constructor stub
	}

	public void ChoclateOpeartor(String brand) {
		this.brand = brand;
		System.out.println("Initialized parametarized constructor");
	}

	public String[] getchoclatename() {
		return choclatename;
	}

	public void addchoclatename(String name) {
		System.out.println("Invoke brand name and choclate name");
		System.out.println("Name of choclate".concat(name));
		if(this.count<5) {
			this.choclatename[this.count]=name;
			count++;
		}
		else {
			System.err.println("Array is filled");
		}
		public void displaychoclatename(); {
			System.out.println("Invoked choclate name");
			for (int c=0;c<this.choclatename.length;c++) {
				String name=this.choclatename[c++];
				System.out.println(name);
			}
			
		}
		
		
	}

}
