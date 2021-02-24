package com.learning.java8;

public class StringTest {

	public static void main(String[] args) {
		String x = "Java";
		String y = x;
		x = x + " Bean";
		System.out.println("x -> "+ x);
		System.out.println("y -> "+ y);
		
		String a = "Java";
		String b = a;
		a.concat(" bean");
		System.out.println("a ->"+ a);
		System.out.println("a ->"+ a.toString());
		System.out.println("b ->"+ b);
		System.out.println("a concat ->"+ a.concat(" Bean"));
	}

}
