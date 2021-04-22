package com.learning.generics;

import java.util.ArrayList;
import java.util.List;

public class CarRental extends Rental {

	public CarRental(int maxNum, List<Car> rentalPool) {
		super(maxNum, rentalPool);
	}
	
	public static void main(String[] args){
		Car c1 = new Car();
		Car c2 = new Car();
		List<Car> carList = new ArrayList<Car>();
		carList.add(c1);
		carList.add(c2);
		
		Rental<Car> carRental = new Rental<Car>(2, carList);
		
		Car carToRent = carRental.getRental();
		carRental.returnRental(carToRent);
	}
//
//	public Car getRental() {
//		return (Car) super.getRental();
//	}
//
//	public void returnRental(Car c) {
//		super.returnRental(c);
//	}
//
//	public void returnRental(Object o) {
//		if (o instanceof Car) {
//			super.returnRental(o);
//		} else {
//			System.out.println("Cannot add a non-Car");
//		}
//	}
}

class Car {

}