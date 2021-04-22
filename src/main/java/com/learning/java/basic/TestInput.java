package com.learning.java.basic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TestInput {
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		List<String> listInp = new LinkedList<String>();
		while(scanner.hasNext()){
			String string = scanner.nextLine();
			System.out.println(string);
			listInp.add(string);
			
				}
		
		String[] strArry = listInp.get(0).split(" ");
		check(Integer.valueOf(strArry[0]), Integer.valueOf(strArry[1]), Integer.valueOf(strArry[2]), Integer.valueOf(strArry[3]));

	}
	
	public static void check(int a, int b, int c, int d){
		int countSquare = 0;
		int countRect = 0;
		int countOther = 0;
		if(a < 0 || b < 0 || c < 0 || d < 0){
			
		}
		else if(a == b && b == c && c == d){
			countSquare++;
		}
		else if(a == c && b == d ){
			countRect++;
		}
		else{
			countOther++;
		}
		System.out.println(countSquare + " " + countRect + " " + countOther);
//		System.exit(0);
	}

}
