package com.learning.generics;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

public class BoxPrinter<T> {
    private T val;

    public BoxPrinter(T arg) {
        val = arg;
    }

    public String toString(){
        return "[" + val + "]";
    }
}

class BoxPrinterTest{
    public static void main(String[] args) {
        BoxPrinter<Integer> integerBoxPrinter = new BoxPrinter<>(10);
        System.out.println(integerBoxPrinter);

        BoxPrinter<String> stringBoxPrinter = new BoxPrinter<>("Hello");
        System.out.println(stringBoxPrinter);

        BoxPrinter<Test> testBoxPrinter = new BoxPrinter<>(new Test("D", 10));
        System.out.println(testBoxPrinter);
    }
}

@Getter
@AllArgsConstructor
@ToString
class Test{
    private String name;
    private int age;
}