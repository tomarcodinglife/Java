package Animal;

import ObjectRefrence.Vehicle;

public class Test {

        public static void main (String[] args){

            // Polymorphism: Upcasting
            Animal animal1 = new Dog(); // Upcasting: Dog is an Animal
            Animal animal2 = new Cat(); // Upcasting: Cat is an Animal

            animal1.eat(); // Output: Dog is eating (runtime polymorphism)
            animal1.sleep(); // Output: Dog is sleeping (runtime polymorphism)

            // Polymorphism: Downcasting
            Dog dog1 = (Dog) animal1; // Downcasting: Animal is a Dog
            dog1.eat(); // Output: Dog is eating
            dog1.sleep(); // Output: Dog is sleeping


            castTest()


        }

    
    



    public static void castTest(Vehicle vehicle) {

        if (vehicle instanceof Car) {
            Car car = (Car) vehicle; // Downcasting: Vehicle is a Car
            car.drive(); // Output: Car is driving
        } else if (vehicle instanceof Bike) {
            Bike bike = (Bike) vehicle; // Downcasting: Vehicle is a Bike
            bike.ride(); // Output: Bike is riding
        } else {
            System.out.println("Unknown vehicle type");
        }

    }


}