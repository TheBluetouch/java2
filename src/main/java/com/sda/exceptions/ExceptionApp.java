package com.sda.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ExceptionApp {
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
            List<String> teksts = new ArrayList<>();
            teksts.add("Ala");
            teksts.add("ma");
            teksts.add("kota");

            teksts.get(5);
            System.out.println("This line is not executed!");
        }catch (IndexOutOfBoundsException exception){
            System.out.println("Error occurred!");
        }
    }
}
