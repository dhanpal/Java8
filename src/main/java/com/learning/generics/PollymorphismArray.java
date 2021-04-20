package com.learning.generics;

import java.util.List;

public class PollymorphismArray {

	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal bird = new Bird();
		
		Doctor doctor = new Doctor();
		doctor.doCheckup(dog);
		doctor.doCheckup(cat);
		doctor.doCheckup(bird);
		
		System.out.println("+++++++++++++++++");
		
		Animal[] array = new Animal[]{dog, cat, bird};
		doctor.doCheckup(array);
		
		System.out.println("+++++++++++++++++");
		
		Dog dog2 = new Dog();
		Dog dog3 = new Dog();
		Dog[] dogarray = new Dog[]{dog2, dog3};
		doctor.doCheckup(dogarray);
		
	}

}
abstract class Animal{
	public abstract void checkup();
}
class Dog extends Animal{
	@Override
	public void checkup() {
		System.out.println("Dog checkup");	
	}	
}
class Cat extends Animal{
	@Override
	public void checkup() {
		System.out.println("Cat checkup");	
	}	
}
class Bird extends Animal{
	@Override
	public void checkup() {
		System.out.println("Bird checkup");
	}
}

class Doctor{
	public void doCheckup(Animal animal){
		animal.checkup();
	}
	public void doCheckup(Animal[] animal){
		for(Animal a : animal){
			a.checkup();
		}	
	}
}