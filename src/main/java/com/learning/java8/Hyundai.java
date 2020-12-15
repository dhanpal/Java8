package com.learning.java8;

public class Hyundai extends Car{
	
	private String color;

	@Override
	public String getColor() {
		return this.color;
	}

	@Override
	public void setColor(String color) {
		this.color = "White";
	}

}
