package com.learning.java8;

public class Ball implements Bouncebale{

	private int bounceHieght;
	
	@Override
	public void bounce() {
		this.bounceHieght = 5;
	}

}
