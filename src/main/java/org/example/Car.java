package org.example;

public class Car extends Vehicle {
    int numOfDoors;

    public Car(String brand, String model, int year, int numOfDoors) throws InvalidYearException {
        super(brand, model, year);
        this.numOfDoors = numOfDoors;
    }

    @Override
    public String vehicleSound() {
        return "Beep Beep";
    }
}
