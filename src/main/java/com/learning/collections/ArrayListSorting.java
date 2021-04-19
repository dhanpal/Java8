package com.learning.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class ArrayListSorting {

	public static void main(String[] args) {
		Dvd dvd1 = new Dvd("A", "A", 1);
		Dvd dvd2 = new Dvd("A", "B", 2);
		Dvd dvd3 = new Dvd("B", "B", 3);
		Dvd dvd4 = new Dvd("B", "A", 4);
		Dvd dvd5 = new Dvd("B", "B", 5);
		
		List<Dvd> list = new ArrayList<Dvd>();
		list.add(dvd5);
		list.add(dvd1);
		list.add(dvd2);
		list.add(dvd3);
		list.add(dvd4);
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		MyComparator comparator = new MyComparator();
		
		Collections.sort(list, comparator);
		
		System.out.println(list);

	}

}

@Getter
@Setter
@AllArgsConstructor
@ToString
class Dvd implements Comparable<Dvd>{
	private String title;
	private String type;
	private int price;
	
	@Override
	public int compareTo(Dvd o) {
		return this.getTitle().compareTo(o.getTitle());
	}
}

class MyComparator implements Comparator<Dvd>{


	@Override
	public int compare(Dvd o1, Dvd o2) {
		return Integer.compare(o1.getPrice(), o2.getPrice());
	}
	}


