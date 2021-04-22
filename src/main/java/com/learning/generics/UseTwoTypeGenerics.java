package com.learning.generics;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UseTwoTypeGenerics<X, Y> {

	private X in1;
	private Y in2;

	public static void main(String[] args) {
		UseTwoTypeGenerics<String, Integer> generics = new UseTwoTypeGenerics<>("MyTest", 100);

		System.out.println(generics.getIn1());
		System.out.println(generics.getIn2());

	}

}

class Temp <T>{
	
}