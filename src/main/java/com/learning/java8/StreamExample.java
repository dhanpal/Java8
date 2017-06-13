package com.learning.java8;

import java.util.Arrays;
import java.util.List;

public class StreamExample {

	public static void main(String[] args) {
		List <Person> p1 = Arrays.asList(
				new Person("Dhanpal","Chauhan","30"),
				new Person("Stefan","Calatean","29"),
				new Person("Kuldeep","Sharma","28"),
				new Person("Vishal","Sharma","28"),
				new Person("Viplav","Kumar","28")
				);
		p1.stream()
		.filter((p) -> p.getLastName().startsWith("C"))
		.forEach((p) -> System.out.println(p));
	}
}