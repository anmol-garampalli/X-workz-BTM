package com.xowrkz.methods.over_riding;

public class StadiumView {

	public static void main(String[] args) {
		
		
		Stadium stadium=new Stadium("Chinnaswamy", "Bangalore", 555);
		Stadium stadium2=new Stadium("Wankhede", "Mumbai", 666);
		
		System.out.println(stadium.equals(stadium2));
		
	}

}
