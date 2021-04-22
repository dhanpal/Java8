package com.learning.java.basic;

public class TestConstructore {

	public static void main(String[] args) {
		

	}

}

class Horsenew extends Animalnew{
	
	Horsenew(String name) {
		super(name);
	}
	
	Horsenew(){
		this("");
	}

	void doStuff(){
		
	}
}

class Animalnew {
	private String name;
	Animalnew(String name) {
		this.name = name;
	}
	
	Animalnew(){
		
	}
}