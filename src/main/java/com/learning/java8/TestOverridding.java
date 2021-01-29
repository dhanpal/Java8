package com.learning.java8;

public class TestOverridding {

	public static void main(String [] args){
		Animal animal = new Animal();
		animal.eat();
		
		Horse horse = new Horse();
		horse.eat();
		
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
}