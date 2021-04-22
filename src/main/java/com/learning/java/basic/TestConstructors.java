package com.learning.java.basic;

public class TestConstructors {

	public static void main(String[] args) {
		ChildCon childCon = new ChildCon("child");

		ChildCon childCon2 = new ChildCon();
	}

}

class ParentCon{
	ParentCon(){
		System.out.println("P");
	}
}

class ChildCon extends ParentCon{
	ChildCon(){
		System.out.println("C");
	}
	ChildCon(String s){
		System.out.println(s);
	}
}