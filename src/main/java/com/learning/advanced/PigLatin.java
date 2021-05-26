package com.learning.advanced;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class PigLatin {
    interface SuffixFunction {
        void call();
    }

    public static void main(String[] args) {
        String str = "Hello";
        Boy boy = new Boy("T", 1);
        SuffixFunction suffixFunction = () -> {
            System.out.println(str + "oo");
//            boy.setAge(10);
//            boy.setName("U");
        };
//        str += "oo";
        Boy boy1 = new Boy("X", 30);
        boy = boy1;
        suffixFunction.call();
        System.out.println(boy);
    }
}

@Getter
@Setter
@AllArgsConstructor
@ToString
class Boy{
    private String name;
    private int age;
}