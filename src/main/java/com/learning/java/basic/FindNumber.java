package com.learning.java.basic;

import java.util.Arrays;
import java.util.List;

public class FindNumber {

	public static void main(String[] args) {
		int size = 10;
		int num = 5;
		
		int[] myArray = {1,2,4,3,5,6,7,8,9,0};
		List<int[]> temp  = Arrays.asList(myArray);
		boolean result = false;
		for(int i = 0; i< myArray.length ; i++){
			if(myArray[i] == num)
				result = true;
		}
		System.out.println(result);
	}

}
