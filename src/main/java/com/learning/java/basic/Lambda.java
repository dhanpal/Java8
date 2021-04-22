package com.learning.java.basic;

public class Lambda {
	public static void main (String [] args){
		Lambda lambda = new Lambda();
		lambda.printMessage("Hello World !");
		
		LambdaInterface blockOfCode = () -> System.out.println("Hello World !");
	}

	public void printMessage(String str){
		System.out.println(str);
	}
}
interface LambdaInterface {
	void temporary();
}
