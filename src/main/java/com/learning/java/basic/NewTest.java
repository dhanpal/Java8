package com.learning.java.basic;

public class NewTest {

	public static void main(String[] args) {
		permutation("dhanpal");
	}
	public static String permutation(String str) { 
		return permutation("", str); 
	}

	private static String permutation(String prefix, String str) {
		int n = str.length();
		if (n == 0)
		{
			return prefix;
		}
		else {
			for (int i = 0; i < n; i++)
				permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
		}
		return null;
	}

	static String[] checkDivisibility(String[] arr) {

		String [] result = new String[arr.length];
		String temp = "";
		for(int i = 0 ; i < arr.length ; i++){

			temp = permutation(arr[i]);
			if(Integer.valueOf(temp) % 8 == 0){
				result[i] = "YES";
				break;
			}
			else{
				
				result[i] = "NO";
			}
		}

		return result;
	}

}
