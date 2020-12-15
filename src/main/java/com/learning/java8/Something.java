package com.learning.java8;

public class Something {

	public static void main(String[] args) {
		System.out.println(Math.sin(30));
		
		Anything x = (int a, int b) -> 2+10;
		System.out.println(x.toString());
		//Anything a = (double x) -> Math.sin(x);
	}

}
