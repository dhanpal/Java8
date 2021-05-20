package com.learning.designpattern;

public class SingletonLogger {
    private static SingletonLogger logger;

    private SingletonLogger(){

    }

    public static SingletonLogger getLogger(){
        if(logger == null){
            logger = new SingletonLogger();
        }
        return logger;
    }
}
