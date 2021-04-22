package com.learning.java.basic;

public class TestOverridding {

	public static void main(String [] args){
		Animal animal = new Animal();
		animal.eat();
		
		Horse horse = new Horse();
		horse.eat();
		horse.eat("grass");
		
		Animal obj = new Horse();
		obj.eat();
		
		
	}
}

class Animal{
	public void eat(){
		System.out.println("Animal eats");
	}
}

class Horse extends Animal{
	public void eat(){
		System.out.println("Horse eats");
	}
	
	public void eat(String input){
		System.out.println("Horse eats : " + input);
	}
}