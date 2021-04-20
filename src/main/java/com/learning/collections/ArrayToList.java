package com.learning.collections;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		String[] myArray = new String[]{"one", "two"};
		
		List<String> myList = Arrays.asList(myArray);
		
		myArray[0] = "three";
		
		myList.set(1, "four");
		
		for (String s : myArray){
			System.out.println(s);
		}
		
		for (String s : myList){
			System.out.println(s);
		}

	}

}
