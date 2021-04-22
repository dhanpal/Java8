package com.learning.java.basic;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;

public class TestEquality_VIMP {

	public static void main(String[] args) {
		Bob b1 = new Bob("B1", 1);
		Bob b2 = new Bob("B2", 1);
		Bob b3 = b1;
		Bob b4 = new Bob("B1", 1);
		
		System.out.println("Java 7 Objects generated");
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));
		
		System.out.println(b1==b3);
		System.out.println(b1.equals(b3));

		System.out.println(b1==b4);
		System.out.println(b1.equals(b4));
		
		System.out.println("Eclipse generated");
		
		Fob f1 = new Fob("B1", 1);
		Fob f2 = new Fob("B2", 1);
		Fob f3 = f1;
		Fob f4 = new Fob("B1", 1);
		
		System.out.println(f1==f2);
		System.out.println(f1.equals(f2));
		
		System.out.println(f1==f3);
		System.out.println(f1.equals(f3));

		System.out.println(f1==f4);
		System.out.println(f1.equals(f4));
		
	}

}
//
//@Data  == > automatocally overrides hashcode, so better not to use in comparison objects
//@AllArgsConstructor
class Bob{

	//Java 7 Objects class for overriding hash code and equals
	@Override
	  public int hashCode() {
	    return Objects.hash(name,age);
	  }

	  @Override
	  public boolean equals(Object obj) {
	    if (obj instanceof Bob) {
	    	Bob right = (Bob) obj;
	      return Objects.equals(name,right.name) && Objects.equals(age,right.age);
	    }
	    return false;
	  }
	
	private String name;
	private int age;
	
	Bob(String name, int age){
		this.name = name;
		this.age = age;
	}
}

class Fob{
	//eclipse generated hash code and override
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fob other = (Fob) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	private String name;
	private int age;
	
	Fob(String name, int age){
		this.name = name;
		this.age = age;
	}
}