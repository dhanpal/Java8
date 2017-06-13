package com.learning.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UnitTesting1SolutionJava7 {

	public static void main(String[] args) {
		List <Person> p1 = Arrays.asList(
				new Person("Dhanpal","Chauhan","30"),
				new Person("Stefan","Calatean","29"),
				new Person("Nitin","Sharma","28")
				);
		//1 . Sort List by last name
		Collections.sort(p1, new Comparator<Person>(){

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
			
		});
		//2 . create method to print list
		printList(p1);
		
		System.out.println("------------------------------------------------");
		
		//3 . create method to print person where last name starts with C
		
		printWithCondition(p1, new Condition(){

			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("C");
			}
			
		});
		
		System.out.println("------------------------------------------------");
		
		//4 . create method to print person where first name starts with C
		printWithCondition(p1, new Condition(){

			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("D");
			}
			
		});

	}
	private static void printWithCondition(List<Person> p1, Condition c) {
		for(Person p : p1){
			if(c.test(p))
			System.out.println(p);
		}
	}
	private static void printList(List<Person> p1) {
		for(Person p : p1){
			System.out.println(p);
		}
		
	}
}
interface Condition{
	boolean test(Person p);
}