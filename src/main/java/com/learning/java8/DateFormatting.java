package com.learning.java8;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class DateFormatting {

	public static void main(String[] args) throws ParseException {
		Date d1 = new Date(); 
		System.out.println(d1.toString());
		
		DateFormat df = DateFormat.getInstance();
		System.out.println(df.format(d1));
		String date = df.format(d1);
		
		Date d2 = df.parse(date);
		System.out.println(d2);
		
		Locale ind = new Locale("hi", "IN");
		DateFormat dfi = DateFormat.getDateInstance(DateFormat.FULL, ind);
		System.out.println(dfi.format(d2));
		
		int rs = 10000000;
		NumberFormat nf = NumberFormat.getCurrencyInstance(ind);
		System.out.println(nf.format(rs));
	}

}
