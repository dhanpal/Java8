package com.learning.java8;

import java.util.function.BiConsumer;

public class ExceptionHandelingLambda {

	public static void main(String[] args) {
		int [] myArray = {1,2,3,4};
		int key = 0;
		//		try{
		process(myArray, key, wrapperLambda((v,k) -> System.out.println(v/k)));
		//		}
		//		catch(Exception e){
		//			System.out.println("Exception Occurred.");
		//		}
	}

	private static void process(int[] myArray, int key, BiConsumer<Integer ,Integer> consumer) {
		for(int v : myArray){
			//			try{
			consumer.accept(v, key);
			//			}
			//			catch(Exception e){
			//				System.out.println("Exception Occurred.");
			//			}
		}	
	}
	private static BiConsumer<Integer ,Integer> wrapperLambda(BiConsumer<Integer ,Integer> consumer){
		return (v,k) -> 
		{
			try{
				consumer.accept(v, k);
			}
			catch(Exception e){
				System.out.println("Exception Occurred.");
			}
		};
	}
}
