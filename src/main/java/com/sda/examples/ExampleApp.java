package com.sda.examples;

public class ExampleApp {
    public static void main(String[] args) {
        Example example = new Example();

        System.out.println(example.toString());
        System.out.println(example.getClass().getCanonicalName());
        System.out.println(example.hashCode());
        System.out.println(example.toString());
  //      System.out.println(example.toString());

    }

    @Override
    public String toString() {

        return "lol"+ getClass().getCanonicalName();

    }
}
