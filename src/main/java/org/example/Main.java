package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Main main = new Main();
        main.run();

    }
    public void displayMenu (){
        System.out.println("Vehicle program!" );
        System.out.println("Choose your preference vehicle: " );
        System.out.println("1. Motorcycles" );
        System.out.println("2. Car" );
        System.out.println("3. Exit\n" );
    }

    public void setOption(int option){
        switch (option){
            case 1:
                try {
                    System.out.print("Enter Motorcycle brand: ");
                    String motorcycleBrand = scanner.next();
                    System.out.print("Enter Motorcycle model: ");
                    String motorcycleModel = scanner.next();
                    System.out.print("Enter Motorcycle year: ");
                    int motorcycleYear = scanner.nextInt();
                    System.out.print("Does Motorcycle have a side car ?(true/false): ");
                    boolean motorcyclehasSidecar = scanner.nextBoolean();

                    Motorcycle motorcycle = new Motorcycle(motorcycleBrand, motorcycleModel, motorcycleYear, motorcyclehasSidecar);
                    System.out.println("Motorcycle Brand you want " + motorcycle.getBrand());
                    System.out.println("Sound for Motorcycle" + motorcycle.vehicleSound());
                    break;
                } catch (InvalidYearException m) {
                    System.out.println(m.getMessage());
                }

            case 2:
                try {
                    System.out.print("Enter Car brand: ");
                    String carBrand = scanner.next();
                    System.out.print("Enter Car model: ");
                    String carModel = scanner.next();
                    System.out.print("Enter Motorcycle year: ");
                    int carYear = scanner.nextInt();
                    System.out.print("How much door the car have?: ");
                    int carNumOfDoors = scanner.nextInt();

                    Car car = new Car(carBrand, carModel, carYear, carNumOfDoors);
                    System.out.println("Car sound: " + car.vehicleSound());
                    break;
                } catch (InvalidYearException m){
                    System.out.println(m.getMessage());
                }
        }
    }
    public void run (){
        //loop untuk menampilkan menu
        while (true){
            displayMenu();
            System.out.println("Enter your preferences: " );
            int option = scanner.nextInt(); //input jenis interger
            setOption(option);
        }
    }
}
