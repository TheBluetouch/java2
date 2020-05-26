package com.sda.calc;

public class Calculator {

    public static int multiplyNumbers(int start, int end, int step) {
        int result = 1;
        for (int i = start; i < end; i = i + step) {
            result = result * i;
        }

        return result;
    }

    public static int multiplyNumbers(int start, int end) {
        int result = 1;
        for (int i = start; i < end; i++) {
            result = result * i;
        }

        return result;
    }

    public static int multiplyNumbers(int end) {
        int result = 1;
        for (int i = 1; i < end; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(multiplyNumbers(2, 10, 3));
        System.out.println(multiplyNumbers(5, 8, 1));
        System.out.println(multiplyNumbers(5, 8));
        System.out.println(multiplyNumbers(2, 10, 3));
        System.out.println(multiplyNumbers(5));
    }
}
