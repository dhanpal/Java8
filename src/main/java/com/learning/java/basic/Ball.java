package com.learning.java.basic;

public class Ball implements Bouncebale{

	private int bounceHieght;
	
	@Override
	public void bounce() {
		this.bounceHieght = 5;
	}

}
