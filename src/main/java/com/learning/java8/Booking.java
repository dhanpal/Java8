package com.learning.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Booking {
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String inp = scanner.nextLine();
		System.out.println(inp);
		List<String> integers = new LinkedList<String>();
		boolean isFirst = true;
		String[] str = inp.split(" ");
		integers = Arrays.asList(str);
		Integer prevNum = 0;
		for(String input : integers){
			if(isFirst){
				System.out.print(Integer.valueOf(input) + " ");
			}
			else{
				System.out.print(check(prevNum, Integer.valueOf(input)) + " ");
			}
			prevNum = Integer.valueOf(input);
			isFirst =false;
		}
	}
	
	public static Integer check(Integer prev, Integer next){
		Integer result;
		result = next - prev;
		if(-127 <= result || result <= 127){
			System.out.print(-128 + " ");
		}
		return result;
	}

}
