package VehicleAbstraction;

public abstract class Car extends Vehicle {
    private String model;
    private String manufacturer;
    private String fuelType;
    private int mileage;


    public Car(int noOfWheels, int noOfSeats, int manufacturingYear, String color, String model, String manufacturer, String fuelType, int mileage) {
        super(noOfWheels, noOfSeats, manufacturingYear, color);
        this.model = model;
        this.manufacturer = manufacturer;
        this.fuelType = fuelType;
        this.mileage = mileage;
    }
    
}
