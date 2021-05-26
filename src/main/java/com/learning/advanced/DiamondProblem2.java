package com.learning.advanced;

public class DiamondProblem2 extends BaseClass implements BaseInterface {
    public static void main(String[] args) {
        new DiamondProblem2().foo();
    }
}

class BaseClass {
    public void foo() {
        System.out.println("Base class");
    }
}

interface BaseInterface {
    default void foo() {
        System.out.println("Base Interface");
    }
}