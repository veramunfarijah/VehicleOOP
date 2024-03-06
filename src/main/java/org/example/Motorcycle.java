package org.example;

public class Motorcycle extends Vehicle{
    boolean hasSidecar;
    public Motorcycle(String brand, String model, int year, boolean hasSidecar) throws InvalidYearException {
        super(brand, model, year) ;
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String vehicleSound() {
        return "tiin tiin";
    }
}
