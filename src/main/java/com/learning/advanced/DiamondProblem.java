package com.learning.advanced;

public class DiamondProblem implements A, B {
    public static void main(String[] args) {
        new DiamondProblem().foo();
    }

    public void foo() {
        A.super.foo();
    }
}

interface A {
    default void foo() {
        System.out.println("Interface A");
    }
}

interface B {
    default void foo() {
        System.out.println("Interface B");
    }
}