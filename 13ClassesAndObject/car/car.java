
package Car;

public class Car {
        // instance  or property
        int wheels;
        String color;
        float maxSpeed;
        float currentFuelInLiters;
        int noOfSeats;

        /*Parameter Constructor Example */
        public Car (String color, float maxSpeed){
            this.color = color;
            this.maxSpeed = maxSpeed;
            wheels = 4;
            noOfSeats = 5;
            currentFuelInLiters = 3;
            System.out.println("Car object created");
        }

        // Default Constructor
        public Car(){
            this("Black", 150); // this line is first work preority 
            
        }

        // public Car (){
        //     color = "Black";
        //     maxSpeed = 150;
        //     wheels = 4;
        //     noOfSeats = 5;
        //     currentFuelInLiters = 3;
        //     System.out.println("Car object created");
        // }



    
        // method   
        public Car start(){
            if (currentFuelInLiters <= 0 ) {
                System.out.println("Please refuel the car");
            }else if (currentFuelInLiters < 3) {
                System.out.println("Please refuel the car because car run in reserved mode");
            }else{
                System.out.println("Car Start.. hunnnnnnnn.....");
            }
            return this; // this refer current class instense  or property
        }

        public void drive(){
            if (currentFuelInLiters <= 0) {
                System.out.println("Car not Starting please refuel");
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