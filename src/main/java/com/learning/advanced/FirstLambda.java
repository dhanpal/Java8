package com.learning.advanced;

public class FirstLambda {
    public static void main(String[] args) {
        LambdaFunction lambdaFunction = () -> System.out.println("Hello World");
        lambdaFunction.call();
    }
}

interface LambdaFunction {
    void call();
}