package com.learning.generics;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Rental<T> {
	private int maxNum;
	private List<T> rentalPool;
	
	public T getRental(){
		return rentalPool.get(0);
	}

	public void returnRental(T o){
		rentalPool.add(o);
	}
}
