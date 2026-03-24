package SuperKeyword;

public class Car extends Vehicle {
    int numberOfDoors;
    int seatingCapacity;
    

    Car(String brand, String model, String color, int numberOfDoors, int seatingCapacity) {
        super(brand, model, color); // Call the constructor of the superclass (Vehicle)
        this.numberOfDoors = numberOfDoors;
        this.seatingCapacity = seatingCapacity;
    }
    
    public void display() {
        super.display(); // Call the display method of the superclass (Vehicle)
        System.out.println("This is a car.");
        System.out.println("Number of doors: " + numberOfDoors);
        System.out.println("Seating capacity: " + seatingCapacity);
    }
    
}
