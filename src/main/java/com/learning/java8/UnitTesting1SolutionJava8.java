package com.learning.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnitTesting1SolutionJava8 {

	public static void main(String[] args) {
		List <Person> p1 = Arrays.asList(
				new Person("Dhanpal","Chauhan","30"),
				new Person("Stefan","Calatean","29"),
				new Person("Nitin","Sharma","28")
				);
		//1 . Sort List by last name
		Collections.sort(p1, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));

		//2 . create method to print list
		printWithCondition(p1, o1 -> true);

		System.out.println("------------------------------------------------");

		//3 . create method to print person where last name starts with C

		printWithCondition(p1, o1 -> o1.getLastName().startsWith("C"));

		System.out.println("------------------------------------------------");

		//4 . create method to print person where first name starts with C

		printWithCondition(p1, o1 -> o1.getFirstName().startsWith("D"));
	}
	private static void printWithCondition(List<Person> p1, Condition c) {
		for(Person p : p1){
			if(c.test(p))
				System.out.println(p);
		}
	}
}