package com.sda.exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetTextExceptionApp {
    public static void main(String[] args) {
////        IndexOutOfBoundsException
//        List<String> teksts = new ArrayList<>();
//        teksts.add("T1");
//        teksts.add("T2");
//
//        teksts.get(3);


////        NullPointerException

//        List<String> teksty = null;
//        teksty.add("T1");
        try {
            List<String> texts = List.of("Ala", "ma", "kota", "a", "Karol", "komputer");

            System.out.println("Choose index from 0 to " + texts.size() +": ");
            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();
            System.out.println("You entered: " + text);

            int index = Integer.parseInt(text);
            System.out.println("Chosen text: " + texts.get(index));

//            teksts.get(5);
//            System.out.println("This line is not executed!");
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("You asked for too much!");
        } catch (NumberFormatException exception) {
            System.out.println("Text you rntered is not a number!");
            //or
            // catch (IndexOutOfBoundsException | NumberFormatException exception) {
            //            System.out.println("Error!");}

        }finally {
            System.out.println("Exiting!");
        }





    }
    void greet (String who){
        System.out.println("Hello, "+ who+ "!");
    }
}
