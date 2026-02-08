
package Car;

public class Car {
        // instanse  or property
        int wheels;
        String color;
        float maxSpeed;
        float currentFuelInLiters;
        int noOfSeats;

        // Default Constructor
        public Car(){
            this.wheels = 4;
            this.noOfSeats = 5;
            this.currentFuelInLiters = 3;
            System.out.println("Car object created");
        }

        /*Parameter Constructor Example */
        public Car(String color, float maxSpeed){
            this.color = color;
            this.maxSpeed = maxSpeed;
        }
    
        // method   
        public Car start(){
            if (currentFuelInLiters <= 0 ) {
                System.out.println("Please refule the car");
            }else if (currentFuelInLiters < 3) {
                System.out.println("Please refule the car because car run in reserved mode");
            }else{
                System.out.println("Car Start.. hunnnnnnnn.....");
            }
            return this; // this refer current class instense  or property
        }

        public void drive(){
            if (currentFuelInLiters <= 0) {
                System.out.println("Car not Starting please refule");
            }else{
                currentFuelInLiters--;
                System.out.println("Car is Driving Bruuhhhh.....");
            }
        }

        public void addFuel(float fuel){
            currentFuelInLiters += fuel;
        }

        public void refuel(float currentFuelInLiters){
            this.currentFuelInLiters += currentFuelInLiters;
        }

        public float getCurrentFuelLevel(){
            System.out.println(currentFuelInLiters);
            return currentFuelInLiters; 

        }

}