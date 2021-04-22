package com.learning.java.basic;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        char[] arr = A.toCharArray();
        
        int mid;
        
        if(A.length() % 2 == 0){
        	mid = A.length()/2 -1;
        }else{
        	mid = A.length()/2;
        }
        
        boolean result = true;
        int i = 0;
        
        while(i <= mid ){
        	if(arr[i] != arr[A.length() -1 - i]){
        		result = false;
        		break;
        	}
        	
        	i++;

        }
        
        if(result){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
        
	}

}
