package com.learning.advanced;

import lombok.AllArgsConstructor;

public class InnerClass {

    private int radius;
    private Model model;

    public InnerClass(int x, int y, int r) {
        radius = r;
        model = this.new Model(x, y);
    }

    public String toString() {
        return "mid point = " + model + " and radius = " + radius;
    }

    @AllArgsConstructor
    class Model {
        private int xPos;
        private int yPos;

        public String toString() {
            return "(" + xPos + "," + yPos + ")";
        }
    }

}

class TestInnerClass {
    public static void main(String[] args) {
        System.out.println(new InnerClass(1, 2, 3));
    }
}