package com.learning.advanced;

public class TestAbstract {
    public void print() {
        System.out.println("Base:print");
    }
}
abstract class Test extends TestAbstract { //#1
    public static void main(String[] args) {
        TestAbstract obj = new TestAbstract();
        obj.print(); //#2
    }

    public abstract void test();

    public final void testFinal(){

    }
}

class Base {}
class DeriOne extends Base {}
class DeriTwo extends Base {}
class ArrayStore {
    public static void main(String []args) {
        Base [] baseArr = new DeriOne[3];
        baseArr[0] = new DeriOne();
        baseArr[2] = new DeriTwo();
        System.out.println(baseArr.length);
    }
}

class Shape{
    protected int getSize(){
        return 0;
    }
}
class Rectangle extends Shape{
    @Override
    public int getSize(){
        return 1;
    }
}