package com.learning.java.basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Polygon {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> input = new ArrayList<>();
		input.add("36 30 36 30");
		input.add("15 15 15 15");
		input.add("1 2 3 4");
		input.add("88 88 88 88");
		input.add("100 200 100 200");
		input.add("100 -200 100 -200");

		int square = 0;
		int rectangle = 0;
		int other = 0;

		//		while(scanner.hasNext()){
		//			input.add(scanner.nextLine());
		//		}

		Iterator<String> iterator = input.iterator();
		while(iterator.hasNext()){
			String[] polygonSide = new String[4];
			int i = 0;
			StringTokenizer st = new StringTokenizer(iterator.next());
//			System.out.println("Polygon : "+st);
			while (st.hasMoreTokens()) {
				polygonSide[i] = st.nextToken();
				i++;
			}
			if(Integer.parseInt(polygonSide[0]) > 0 && Integer.parseInt(polygonSide[1]) > 0){
				if(Integer.parseInt(polygonSide[0]) == Integer.parseInt(polygonSide[1]) && Integer.parseInt(polygonSide[1]) == Integer.parseInt(polygonSide[2]) && Integer.parseInt(polygonSide[2]) == Integer.parseInt(polygonSide[3])){
//					for(int j = 0 ; j < 4 ; j++){System.out.println("Square "+polygonSide[j]);}
					square++;
				}
				else if((Integer.parseInt(polygonSide[0]) == Integer.parseInt(polygonSide[2])) && (Integer.parseInt(polygonSide[1]) == Integer.parseInt(polygonSide[3]))){
//					for(int j = 0 ; j < 4 ; j++){System.out.println("Rectangle "+polygonSide[j]);}
					rectangle++;
				}
				else{
//					for(int j = 0 ; j < 4 ; j++){System.out.println("Other "+polygonSide[j]);}
					other++;
				}
			}
			else{
//				for(int j = 0 ; j < 4 ; j++){System.out.println("Other "+polygonSide[j]);}
				other++;
			}
		}
		System.out.println(square+" "+rectangle+" "+other);
		scanner.close();
	}
}
