package SuperKeyword;

public class Vehicle extends Transport {
    String brand;
    String model;
    String color;

    // Constructor
    Vehicle(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }


    // Method to display vehicle information
    public void display() {
        System.out.println("This is a vehicle.");
    }

    @Override
    void start() {
        System.out.println("Vehicle is starting.");
    }

    @Override
    void stop() {
        System.out.println("Vehicle is stopping.");
    }


    
}
