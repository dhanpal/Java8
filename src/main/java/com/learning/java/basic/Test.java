package com.learning.java.basic;
import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main (String[] arg) {
//		System.out.println("Hi");
		int [] op = doLogic(40056700);
		for(int i=0 ; i < op.length ;i ++){
			System.out.println(op[i]);
		}
		
	}
	private static int[] doLogic(int value) {
		List<Integer> list = new ArrayList();
		while (value > 0) {
			Integer localCopy = value;
			int length = localCopy.toString().length();
			int divider = (int) Math.pow(10.0, length - 1.0);
			list.add((value / divider) * divider);
			String trimmedValue = localCopy.toString().substring(1);
			while (trimmedValue.length() > 1 && trimmedValue.charAt(0) == '0') {
				trimmedValue = trimmedValue.toString().substring(1);
			}
			if (trimmedValue.length() == 0) {
				break;
			}
			value = Integer.parseInt(trimmedValue);
		}

		int returnArray[] = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			returnArray[i] = list.get(i);
		}
		return returnArray;
	}
}