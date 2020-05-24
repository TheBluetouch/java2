package com.sda.exceptions;

import java.util.Scanner;

public class ExceptionApp {
    public static void main(String[] args) throws InvalidNameException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String inputText = scanner.nextLine();
//        try {
            greet(inputText);
//        } catch (InvalidNameException exception) {
//           // System.out.println("It seems like you passed wrong data!");
//            System.out.println("Error occurred");
//        }
        System.out.println("Next message");

    }

    private static void greet(String name) throws InvalidNameException{
        if (name == null || name.isBlank()) {
          //  throw new IllegalArgumentException("Passed text [" + name + "] is invalid");
            throw new InvalidNameException(name);
        }
        System.out.println("Hello, " + name);
    }
}
