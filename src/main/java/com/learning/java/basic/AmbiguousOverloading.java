package com.learning.java.basic;

public class AmbiguousOverloading {
    public static void main(String[] args) {
        print(100, "S");
    }

    public static void print(int i, String s){
        System.out.println("int String");
    }

    public static void print(Integer i, String s){
        System.out.println("Integer String");
    }

    public static void print(long l, String s){
        System.out.println("long String");
    }

//    You cannot overload methods with the methods differing in return types alone.
//    You cannot overload methods with the methods differing in exception specifications alone.
//    public static Object print(long l, String s) throws Exception{
//        System.out.println("long String");
//        return null;
//    }
}
