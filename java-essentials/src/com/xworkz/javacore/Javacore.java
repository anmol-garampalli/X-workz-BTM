package com.xworkz.javacore;

public class Javacore {
	
	public static void main(String args[]) {

	String name = "Xworkz";
	boolean contain=name.contains("nags");
	System.out.println("contains"+contain);
	
	String branch = new String("KENGERI");
	boolean containsGE=branch.contains("RI");
	System.out.println(branch.contains("RI"));
	
	char[] chars= {'N','A','G','S'};
	String convertedString=String.copyValueOf(chars);
	System.out.println(convertedString);
	
	String nags="Naganna";
	String nags2="Nagappa";
	
	boolean same=nags.equals(nags2);
	System.out.println("SAME" +same);
	
	//Indexof method
	String indexmethod="Hey Folks welcome to Xworkz Tutorials by Omkar Sir";
	System.out.println(indexmethod.indexOf("Folks"));
	
	//Stringlength
	String aboutanmol="Anmol is a very passionate guy who deeply belives that technology is going to change how we lead our lives";
	System.out.println(aboutanmol.length());
	
	//endswithmethod
	String endgame="Avengers endgame is one of the greatest movies of all time";
	System.out.println(endgame.endsWith("ime"));

    //Replace method
	String replace="This method is used to replace string";
	System.out.println(replace.replace('l','c'));
	System.out.println(replace);
	
	//Starts_with
	String starter="This method checks if a string starts with specific set of characters";
	System.out.println(starter.startsWith("This"));
	
	//upper_case
	String uppercase="this text is in Uppercase";
	System.out.println(uppercase.toUpperCase());
	System.out.println(uppercase);
	
	//Remove whitespace
	String blankspaces="          Jai Hind+     ";
	System.out.println(blankspaces.trim());

}
}
