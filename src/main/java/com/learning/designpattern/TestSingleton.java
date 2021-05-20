package com.learning.designpattern;

public class TestSingleton {

    public static void main(String[] args) {
        SingletonLogger logger = SingletonLogger.getLogger();
        System.out.println(logger.hashCode());

        SingletonLogger logger1 = SingletonLogger.getLogger();
        System.out.println(logger1.hashCode());
    }

}
