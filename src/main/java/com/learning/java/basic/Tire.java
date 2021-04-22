package com.learning.java.basic;

public class Tire implements Bouncebale{
	
	private int bounceHieght;

	@Override
	public void bounce() {
		this.bounceHieght =10;
	}

}
