package com.learning.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1); //Autoboxing
		list.add(10);
		list.add(new Integer(5));
		
		System.out.println(list);
		
		System.out.println(list.size());
		
		Collections.sort(list);
		
		System.out.println(list);

	}

}
