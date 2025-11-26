package se.lexicon;

public class Car {

    String brand;
    String registrationNumber;
    int maxSpeed;
    String ownerName;
    String color;

    public void displayCarInfo(){
        IO.println("Car Brand: " + brand);
        IO.println("Registration Number: " + registrationNumber);
        IO.println("Max Speed: " + maxSpeed);
        IO.println("Owner Name: " + ownerName);
        IO.println("Color: " + color);
    }


}
