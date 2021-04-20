package com.learning.collections;

import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class HashmapTest {

	public static void main(String[] args) {
		Map<Dog, Owner> myMap = new HashMap<Dog, Owner>();
		
		Dog d1 = new Dog("D1", 1);
		Dog d2 = new Dog("D2", 2);
		Dog d3 = new Dog("D3", 3);
		
		Owner o1 = new Owner("O1");
		Owner o2 = new Owner("O2");
		Owner o3 = new Owner("O3");
		
		myMap.put(d1, o1);
		myMap.put(d2, o2);
		myMap.put(d3, o3);
		
		Dog d4 = new Dog("D1", 1);
		
		System.out.println(myMap.get(d1));
		System.out.println(myMap.get(d2));
		System.out.println(myMap.get(d3));
		
		System.out.println(myMap.get(d4));

	}

}

@Getter
@Setter
@AllArgsConstructor
class Dog{
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
		Dog other = (Dog) obj;
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
		
}

@Getter
@Setter
@AllArgsConstructor
@ToString
class Owner{
	private String name;
}