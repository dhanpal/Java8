package com.learning.java8;

public class Simpson {
	public static double integrate(DoubleFunction df, double a, double b, int n)
	{
		DoubleFunctionSineAdapter sine = new DoubleFunctionSineAdapter();
		double result = Simpson.integrate(sine, 0, Math.PI, 30);
		return result;
	}
}
