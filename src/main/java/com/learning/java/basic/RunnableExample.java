package com.learning.java.basic;

public class RunnableExample {

	public static void main(String[] args) {
		Thread th1 = new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println("Inside First.");
			}
			
		});
		th1.run();
		
		Thread th2 = new Thread(() -> System.out.println("Inside Second."));
		th2.run();
	}

}
