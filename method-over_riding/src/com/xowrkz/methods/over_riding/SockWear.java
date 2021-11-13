package com.xowrkz.methods.over_riding;

public class SockWear {

	public static void main(String[] args) {
		Sock sock = new Sock();
		Sock sock2 = new Sock();

		System.out.println(sock.toString());
		System.out.println(sock2.toString());

		System.out.println(sock.hashCode());
		System.out.println(sock2.hashCode());

		System.out.println(sock.setBrandName("Puma"));
		System.out.println(sock2.setBrandName("Nike"));
		System.out.println(sock.equals(sock2));

		System.out.println(sock.setLength(150));
		System.out.println(sock2.setLength(150));
		System.out.println(sock.equals(sock2));

	}

}
