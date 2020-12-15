package com.learning.java8;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            checkPoly(a, b, c, d);
        }
    }
    public static void checkPoly(int a, int b, int c, int d){
        int countSquare = 0;
        int countRect = 0;
        int countOther = 0;
        if(a < 0 || b < 0 || c <0 || d < 0){
            //Nothing
        }
        else if(a == b && b == c && c == d){
            countSquare++;
        }
        else if(a == c && b == d){
            countRect++;
        }
        else{
            countOther++;
        }
        System.out.print(countSquare + " " + countRect + " " + countOther);
    }
}

