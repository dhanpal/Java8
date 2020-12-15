package com.learning.java8;

import java.util.ArrayList;
import java.util.List;

public class Execute {

	public static void main(String[] args) {
		List<Message> l = new ArrayList<Message>();
		Message m1 = new Message();
		m1.setMessageType("MT540");
		m1.setCount(100);
		l.add(m1);
		Message m2 = new Message();
		m2.setMessageType("MT541");
		m2.setCount(200);
		l.add(m2);
		Message m3 = new Message();
		m3.setMessageType("MT542");
		m3.setCount(300);
		l.add(m3);
		Message m4 = new Message();
		m4.setMessageType("MT543");
		m4.setCount(400);
		l.add(m4);
		
		//Total Received
					   //input    // definition
		Calculation c = ( ) -> {return m1.getCount() + m2.getCount();};
		
		print(c,"Recieved");
		
		//Total Delivered
		Calculation c1 = ( ) -> {return m3.getCount() - m4.getCount();};
		
		print(c1,"Delivered");
		//Total
		
	}
	
	public static void print(Calculation ca,String msg){
		System.out.println(msg +" --> "+ca.calculate());
	}

}
