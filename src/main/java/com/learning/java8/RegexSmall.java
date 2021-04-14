package com.learning.java8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSmall {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\d+"); // the expression
		Matcher m = p.matcher("1 a12 234b"); // the source
		while(m.find()) {
		System.out.print(m.start() + " ");
		}
	}

}
