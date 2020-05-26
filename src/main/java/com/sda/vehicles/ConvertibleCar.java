package com.sda.vehicles;

public class ConvertibleCar extends Car{
    boolean roofIsOpen;

    public ConvertibleCar() {
        roofIsOpen = false;
    }

    void openRoof(){
        roofIsOpen =true;
        System.out.println("Roof is open");
    }
    void closeRoof(){
        roofIsOpen =false;
        System.out.println("Roof is close");
    }
}
