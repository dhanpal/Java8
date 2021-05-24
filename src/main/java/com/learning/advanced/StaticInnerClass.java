package com.learning.advanced;

import lombok.AllArgsConstructor;

abstract class StaticInnerClass {

    @AllArgsConstructor
    public static class Model {
        private int m_red, m_green, m_blue;

        public String toString() {
            return " red = " + m_red + " green = " + m_green + " blue = " + m_blue;
        }
    }
}

class TestStaticInnerClass {
    public static void main(String[] args) {
        StaticInnerClass.Model model = new StaticInnerClass.Model(1, 2, 3);
        System.out.println(model);
    }
}