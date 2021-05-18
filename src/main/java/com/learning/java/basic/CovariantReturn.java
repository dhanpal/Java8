package com.learning.java.basic;

import lombok.AllArgsConstructor;

public class CovariantReturn {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
//        Circle circle1 = (Circle) circle.copy();
        Circle circle1 = circle.copy();
    }
}

abstract class Shape {
    public abstract Shape copy();
}

@AllArgsConstructor
class Circle extends Shape {
    private int radius;

    @Override
    public Circle copy() {
        return this;
    }

//    @Override
//    public Shape copy() {
//        return this;
//    }
}