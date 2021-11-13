package com.xworkz.method.overiding.november10;

public class WatchStarter {

	public static void main(String[] args) {
		Watch watch = new Watch();
		Watch watch2 = new Watch();

		System.out.println(watch.toString());
		System.out.println(watch.hashCode());

		System.out.println(watch2.toString());
		System.out.println(watch2.hashCode());

		watch.setName("Fastrack");
		watch2.setName("Fastrack");
		System.out.println(watch.equals(watch2));
	}

}
