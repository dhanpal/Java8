package com.learning.advanced;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

public class LocalInnerClass {
    public static void main(String[] args) {
        House.Room descriptive = LocalInnerClass.getColor(new House.Room(1, 2, 3));
        System.out.println(descriptive);
    }

    public static House.Room getColor(House.Room room) {
        //Local inner class
//        class DescriptiveColor extends House.Room {
//            public String toString() {
//                return "You selected a color with RGB values" + room;
//            }
//        }
//        return new DescriptiveColor();

        //Anonymous Inner class
        return new House.Room(){
            public String toString() {
                return "You selected a color with RGB values" + room;
            }
        };
    }
}

abstract class House {
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Room {
        int m_red, m_green, m_blue;

        @Override
        public String toString() {
            return " red = " + m_red + " green = " + m_green + " blue = " + m_blue;
        }
    }
}