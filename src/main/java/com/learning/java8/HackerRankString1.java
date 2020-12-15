package com.learning.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class HackerRankString1 {

	public static void main(String[] args) {
		String str = "welcometojava";
		int i = 3;
		int a = 0;
		
		String smallest = null;
        String largest = null;
        String temp = str.substring(0, i);

		
		while(a+i <= str.length()){
			
			temp = str.substring(a, a+i);
			smallest = temp;
			largest = temp;
			
			if (temp.compareTo(smallest) < 0) {
                smallest = temp;
            }
            
            if (temp.compareTo(largest) > 0) {
                largest = temp;
            }
			
			a++;
		}
		
		System.out.println();
		System.out.println(smallest);
		System.out.println(largest);

	}

}
