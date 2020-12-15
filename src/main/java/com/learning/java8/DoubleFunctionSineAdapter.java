package com.learning.java8;

public class DoubleFunctionSineAdapter implements DoubleFunction
{
	public double f(double x)
	{
		return Math.sin(x);
	}
}