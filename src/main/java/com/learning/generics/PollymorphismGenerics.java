package com.learning.generics;

import java.util.ArrayList;
import java.util.List;

public class PollymorphismGenerics {

	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal bird = new Bird();

		DoctorAdd doctor = new DoctorAdd();

		List<Animal> animals = new ArrayList<>();
		animals.add(dog);
		animals.add(cat);
		animals.add(bird);

		doctor.addAnimal(animals);
		
		List<Dog> dogs = new ArrayList<>();
		dogs.add(new Dog());
		
		doctor.addAnimal(dogs);
		
		doctor.addAnimal(animals);

	}
}

class DoctorAdd {
//	public void addAnimal(List<? extends Animal> animals) {
////		animals.add(new Dog());
//	}
	
	public void addAnimal(List<? super Dog> animals) {
		animals.add(new Dog());
	}
}
