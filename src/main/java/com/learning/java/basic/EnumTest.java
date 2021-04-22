package com.learning.java.basic;

public class EnumTest {

	public static void main(String[] args) {
		Coffe coffe = new Coffe();
		coffe.coffeeSize = CoffeeSize.BIG;
		System.out.println(coffe.coffeeSize.getSize());
		
	}

}

enum CoffeeSize {
	BIG(10), MEDIUM(8), SMALL(5);
	
	CoffeeSize(int size){
		this.size = size;
		}
	
	int size;
	
	public int getSize(){return this.size;}
	}

class Coffe{
	CoffeeSize coffeeSize;
}

interface A{}
interface B{}
interface C extends A, B{}