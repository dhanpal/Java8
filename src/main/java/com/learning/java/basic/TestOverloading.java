package com.learning.java.basic;

public class TestOverloading {

	public static void main(String[] args) {
		TestOverloading overloading = new TestOverloading();
		Animal animal = new Animal();
		Horse horse = new Horse();
		Animal obj = new Horse();

		overloading.doStuff(animal);
		overloading.doStuff(horse);
		overloading.doStuff(obj);
	}
	
	public void doStuff(Animal animal){
		System.out.println("Animal");
	}
	
	public void doStuff(Horse horse){
		System.out.println("Horse");
	}
}