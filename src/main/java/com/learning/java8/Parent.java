package com.learning.java8;

public class Parent {
	protected int x;
	public Integer value;
	
	public void doStuff(String name, int ... x){
		System.out.println(x.length);
	}
	
	public void callStuff(){
		doStuff("test", 1,2,1,1,12,34,5);
	}
	
	public static void main(String ...strings ){
		int count = 0;
		System.out.println(count);
		
		Parent parent = new Parent();
		parent.callStuff();
		System.out.println(parent.x);
		System.out.println(parent.value);

	}
	
}
