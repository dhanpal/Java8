package com.learning.java.basic;

public class TestInterface{
public static void main(String[] args){
	Zap zap = new Zap();
	zap.testMe();
	
	Parent parent = new Parent();
	System.out.println(parent.x);
}
}

interface Foo{
	int BAR = 40;
	void go();
}

class Zap extends Moo implements Foo{

	@Override
	public void go() {
//		BAR = 27;
		
	}
	
	public void testMe(){
		System.out.println(this.coolMethod());
		System.out.println(this.name);
	}
	
}


