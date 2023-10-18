package edu.java_se.some_auxiliary_class3;

public class SomeAuxiliaryClass3 {
    private int counter = 0;
    public int getCounter() {
        return counter;
    }

    public static void main(String[] args) {
        var someAuxiliaryClass = new SomeAuxiliaryClass3();
        someAuxiliaryClass.counter = 4;
        System.out.println(someAuxiliaryClass.getCounter());
    }
}
