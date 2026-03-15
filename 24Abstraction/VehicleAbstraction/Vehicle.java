package VehicleAbstraction;

public abstract class Vehicle {
    private int noOfWheels;
    private int noOfSeats;
    private int manufacturingYear;
    private String color;

    public Vehicle(int noOfWheels, int noOfSeats, int manufacturingYear, String color) {
        this.noOfWheels = noOfWheels;
        this.noOfSeats = noOfSeats;
        this.manufacturingYear = manufacturingYear;
        this.color = color;
    }

    // Abstract method to be implemented by subclasses
    public abstract void runVehicle();
    

    
}
