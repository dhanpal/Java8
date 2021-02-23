package com.learning.java8;

import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) {
		ExceptionTest exceptionTest = new ExceptionTest();
		try {
			exceptionTest.doStuff();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void doStuff() throws IOException{
		doMore();
		throw new MyException("Exception occurred");
	}

	public void doMore() throws IOException{
		throw new IOException();
	}
}

class MyException extends RuntimeException{
	MyException(String error){
		
	}
}