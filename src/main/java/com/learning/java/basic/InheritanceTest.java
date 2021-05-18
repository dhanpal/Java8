package com.learning.java.basic;

public class InheritanceTest {

    public static void main(String[] args) {
        Color color = new Black();
        Color color1 = new Blue();
        doStuff(color);
        doStuff(color1);
    }

    public static void doStuff(Color color) {
        if (color instanceof Black)
            ((Black) color).paint();
        else if (color instanceof Blue)
            ((Blue) color).paint();
    }

    static class Color {
        private String name;

        public String getColor() {
            return name;
        }

        public void show() {
            System.out.println("Show Color");
        }
    }

    static class Black extends Color {
        public void paint() {
            System.out.println("Painted black");
        }
    }

    static class Blue extends Color {
        public void paint() {
            System.out.println("Painted blue");
        }
    }
}