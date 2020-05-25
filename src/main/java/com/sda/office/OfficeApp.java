package com.sda.office;

import java.util.Scanner;

public class OfficeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Package rower = new Package("misiuPysiu");
//        System.out.println(rower);
//
//        rower.changeStatus(PackageStatus.LOST);
//        System.out.println(rower);
        System.out.println("Welcome!");
        System.out.println("Statuses: ");

        PackageStatus[] statuses=PackageStatus.values();
        for(PackageStatus status : statuses){
            System.out.println("Status: " + status+ "; next: "+ status.nextStatus());
        }

            System.out.println("Choose status: ");
            String inputText = scanner.nextLine();
        try {
            PackageStatus chosenStatus = PackageStatus.valueOf(inputText.toUpperCase());
            System.out.println("Status:"+chosenStatus.getDescription());
        }catch(IllegalArgumentException e ){
            System.out.println(e.getMessage());

        }
    }
}
