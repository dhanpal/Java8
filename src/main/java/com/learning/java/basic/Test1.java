package com.learning.java.basic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Test1 {

	public static void main(String[] args) {
		String[] polygonSide = new String[4];
		polygonSide[0] = "100";
		polygonSide[1] = "-200"; 
		polygonSide[2] = "100";
		polygonSide[3] = "-200";

		System.out.println(polygonSide[0]);
		System.out.println(polygonSide[2]);
		System.out.println(Integer.parseInt(polygonSide[0]) == Integer.parseInt(polygonSide[2]));
		System.out.println(polygonSide[1]);
		System.out.println(polygonSide[3]);
		System.out.println(Integer.parseInt(polygonSide[1]) == Integer.parseInt(polygonSide[3]));
		System.out.println((Integer.parseInt(polygonSide[0]) == Integer.parseInt(polygonSide[2])) && (Integer.parseInt(polygonSide[1]) == Integer.parseInt(polygonSide[3])));
	}

}
