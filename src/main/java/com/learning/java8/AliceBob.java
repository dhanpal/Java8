package com.learning.java8;

import java.util.Scanner;

public class AliceBob {
	static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
		// Complete this function
		int point1 = 0;
		int point2 = 0;
		point1 = a0 > b0 ? point1+1 : point1 ;
		point1 = a1 > b1 ? point1+1 : point1 ;
		point1 = a2 > b2 ? point1+1 : point1 ;

		point2 = b0 > a0 ? point2+1 : point2;
		point2 = b1 > a1 ? point2+1 : point2;
		point2 = b2 > a2 ? point2+1 : point2;

		int [] result = new int[2];
		result[0] = point1;
		result[1] = point2;

		return result;
	}

	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
		int a0 = 5;
		int a1 = 6;
		int a2 = 7;
		int b0 = 3;
		int b1 = 6;
		int b2 = 10;
		int[] result = solve(a0, a1, a2, b0, b1, b2);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
		}
		System.out.println("");


	}

}
