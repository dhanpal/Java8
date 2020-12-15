package com.learning.java8;

public class OddNumber {

	public static void main(String[] args) {
		int [] output = myArray(95,97);
	}
	
	public static int[] myArray(int l, int r){
		float f=(r-l)/2;
		int size = (int) Math.ceil(f);
		System.out.println(size+1);
		int[] temp = new int[size+1];
		int lowerValue = l;
		int upperValue = r;
		int i = 0;
		if(lowerValue % 2 != 0){
			int nextVal = lowerValue;
			do
			{
				System.out.println(nextVal);
				temp[i] = nextVal;
				nextVal = nextVal + 2;
				i++;
			}while(nextVal <= upperValue);
		}
		else{
			int nextVal = lowerValue+1;
			do{
				System.out.println(nextVal);
				temp[i] = nextVal;
				nextVal = nextVal + 2;
				i++;
			}while(nextVal <= upperValue);
		}
		return temp;
	}
}
