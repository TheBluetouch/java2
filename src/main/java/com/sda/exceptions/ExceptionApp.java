package com.sda.exceptions;

import java.util.Scanner;

public class ExceptionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String inputText = scanner.nextLine();
        try {
            greet(inputText);
        } catch (IllegalArgumentException e) {
            System.out.println("It seems like you passed wrong data!");
        }

    }

    private static void greet(String who) {
        if (who == null || who.isBlank()) {
            throw new IllegalArgumentException("Passed text [" + who + "] is invalid");
        }
        System.out.println("Hello, " + who);
    }
}
