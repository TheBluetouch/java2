package com.sda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasicCollectionsApp {
    public static void main(String[] args) {
        List<String> teksty = new ArrayList<>();
        teksty.add("Tekst 1");
        teksty.add("Tekst 2");

        for (int i = 0; i < teksty.size(); i++) {
            System.out.println(teksty.get(i));

        }

        Map<String,String> phoneNumbers= new HashMap<>();
        phoneNumbers.put("Karol","8468464684684");
        //replace previous
        phoneNumbers.put("Karol","5555555584684");
        phoneNumbers.put("Alina","8468464684684");

        System.out.println(phoneNumbers.get("Alina"));
        System.out.println(phoneNumbers.get("Karol"));
        System.out.println(phoneNumbers.containsKey("Karol"));
        System.out.println(phoneNumbers.containsValue("0700888888"));
    }
}
