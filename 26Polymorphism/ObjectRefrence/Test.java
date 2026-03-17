package ObjectRefrence;

public class Test extends Car {
    
    public static void main(String[] args) {
        Car car = new Car();
        Vehicle vehicle = new Vehicle();

        /*
        
        Vehicle v = new Car(); // Upcasting: Car is a Vehicle

        Vehicle ve = (Car) new Vehicle(); // Downcasting: Vehicle is not a Car, this will cause a compile-time error

        */

        // Car c = new Vehicle(); // Downcasting: Vehicle is not a Car, this will cause a compile-time error
    }
    
}
