package com.xworkz.wrapperclass;

public class Wrapperstarter {

	public static void main(String[] args) {
		
		//Integer methods
		int a=10;
		System.out.println("Integer Methods");
		System.out.println(Integer.bitCount(a)); //bit count
		System.out.println(Integer.toBinaryString(a));  //binary string
		System.out.println(Integer.compare(100, 500)); //compare
		System.out.println(Integer.max(100, 200)); //maximum
		System.out.println(Integer.compareUnsigned(100, 200)); //compare unsigned
		System.out.println(Integer.min(100,100)); //minimum of two numbers
		System.out.println("");
		
		//Float methods
		float f = 37.5f;
		System.out.println("Float Methods");
		System.out.println(Float.SIZE); //bit size
		System.out.println(Float.NEGATIVE_INFINITY); //negative infinity
		System.out.println(Float.POSITIVE_INFINITY);  //positive infinity
		System.out.println(Float.hashCode(37.5f)); //hashcode
		System.out.println(Float.isFinite(37.5f)); //is finite
		System.out.println(Float.MIN_NORMAL); //min normal value
		
		//Double Methods
		double d=64.75d;
		System.out.println("");
		System.out.println("Double methods");
		System.out.println(Double.doubleToRawLongBits(64.75d)); //rawlongbits
		System.out.println(Double.sum(64.7545d, 64.765d)); //double sum
		System.out.println(Double.doubleToLongBits(64.75d)); //double to long bits
		System.out.println(Double.SIZE); //size of double
		System.out.println(Double.MIN_EXPONENT);
		
		//boolean methods
		boolean bool=true;
		System.out.println("");
		System.out.println("Boolean Methods");
		System.out.println(Boolean.logicalAnd(true, true));
		System.out.println(Boolean.logicalAnd(true, false)); //logical and
		System.out.println(Boolean.logicalOr(true, false)); //logicalor
		System.out.println(Boolean.parseBoolean(null));
		System.out.println(Boolean.compare(true, false));
		
		//character methods
		
		
	
		
		
		
		
		
		
	}

}
