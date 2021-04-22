package com.learning.java.basic;

public class ArrayTest {

	public static void main(String[] args) {
		Box[] boxs = new Box[2];
		Shoe[] shoes = new Shoe[2];
		boxs = shoes;
		shoes = (Shoe[]) boxs;
		Foldable[] foldables = new Foldable[2];
		foldables = shoes;
		shoes = (Shoe[]) foldables;
	}

}
class Box{}
class Shoe extends Box implements Foldable{}
interface Foldable{}