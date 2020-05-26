package com.sda.vehicles;

public class Car extends Vehicle {
    int passengers = 0;

    public Car() {
        super(4);
        System.out.println("Car constructor");

        super.run(10);
    }

    void addPassenger() {
        if (passengers <= 3) {
            ++passengers;
            System.out.println("Adding new passenger. Current number: " + passengers);
        } else {
            System.out.println("Addition new passenger is not possible. The car is full!");
        }
    }

    void removePassenger() {
        --passengers;
        if (passengers <= 0) {
            passengers = 0;
            System.out.println("Current number of passengers is 0 you could not remove a passenger!");
        }
        System.out.println("Removing a passenger. Current number: " + passengers);
    }

    @Override
    public String toString() {
        return "Car passengers= " + passengers;
    }
}
