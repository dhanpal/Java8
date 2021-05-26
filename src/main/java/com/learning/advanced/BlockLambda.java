package com.learning.advanced;

public class BlockLambda {
    interface LambdaFunction{
        String intKind(int i);
    }

    public static void main(String[] args) {
        LambdaFunction lambdaFunction = (i) -> {
            if((i % 2) == 0) return "even";
            else return "odd";
        };

        System.out.println(lambdaFunction.intKind(25));
    }
}
