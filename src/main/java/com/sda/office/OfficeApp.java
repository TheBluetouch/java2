package com.sda.office;

public class OfficeApp {
    public static void main(String[] args) {
        Package rower = new Package("misiuPysiu");
        System.out.println(rower);

        rower.changeStatus(PackageStatus.LOST);
        System.out.println(rower);
    }
}
