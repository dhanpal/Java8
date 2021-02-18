package com.learning.java8;

public class SwitchCase {

	public static void main(String[] args) {
		int i = 1;

		final int a = 1;
		final int b = 2;

		switch (i){
		case a : System.out.println(10);
		System.out.println("First block");
		break;
		case b : System.out.println(20);
		System.out.println("Second block");
		break;
		default : System.out.println(100);
		System.out.println("Default block");
		}

		Colors test = Colors.GREEN;
		
		switch(test){
			case RED : System.out.println("RED");
			break;
			case BLUE : System.out.println("BLUE");
			break;
			case GREEN : {System.out.println("GREEN");
			break;}
			default : System.out.println("CB");
		}

	}

}

enum Colors{
	RED, GREEN, BLUE;
}