package edu.java_se.some_auxiliary_class2;

public class SomeAuxiliaryClass2 {
    public static int multiply(int number) {
        return number * number;
    }

    public static void uselessMethd(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("I will not say the result! Ha ha ha ha!");
    }

    public static void main(String[] args) {
        System.out.println(multiply(5));
        uselessMethd(5, 5);
    }
}
