package FinalKeyword;

public class Vehicle {
    
    // It is final method, which means it cannot be overridden by any subclass. This ensures that the behavior defined in this method remains consistent across all subclasses of Car.

    public final void display() {
        System.out.println("This is a car.");
    }

    public final void start() {
        System.out.println("Car is starting.");
    }

    public final void stop() {
        System.out.println("Car is stopping.");
    }



}
