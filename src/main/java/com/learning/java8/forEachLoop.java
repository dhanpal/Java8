package com.learning.java8;

import java.util.Arrays;
import java.util.List;

public class forEachLoop {

	public static void main(String[] args) {
		List <Person> p1 = Arrays.asList(
				new Person("Dhanpal","Chauhan","30"),
				new Person("Stefan","Calatean","29"),
				new Person("Kuldeep","Sharma","28"),
				new Person("Vishal","Sharma","28"),
				new Person("Viplav","Kumar","28")
				);
		System.out.println("for loop.");
		for(int i=0; i<p1.size(); i++ ){
			System.out.println(p1.get(i).getFirstName());
		}
		System.out.println("for in loop.");
		for(Person p : p1){
			System.out.println(p.getFirstName());
		}
		System.out.println("Java8 forEach in loop.");
		p1.forEach((p) -> System.out.println(p.getFirstName()));
	}

}
