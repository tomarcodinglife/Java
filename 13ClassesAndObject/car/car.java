
    package car;

    public class car {
        // instense  or property
        int noOfWheels;
        String color;
        float maxSpeed;
        float currentFuelInLiters;
        int noOfSeats;

        // method

        public car start(){
            if (currentFuelInLiters == 0 || currentFuelInLiters > 0) {
                System.out.println("Please refule the car");
            }else if (currentFuelInLiters < 3) {
                System.out.println("Please refule the car because car run in reserved mode");
                ;
            }else{
                System.out.println("Car Star.. hunnnnnnnn.....");
            }
            return this;
        }

        public void drive(){
            if (currentFuelInLiters >= 0) {
                System.out.println("Car not Starting please refule");
            }else{
                currentFuelInLiters--;
                System.out.println("Car is Driving Bruuhhhh.....");
            }
        }

        public void addFuel(float fuel){
            currentFuelInLiters += fuel;
        }

        public float getCurrectFuelLevel(){
            System.out.println(currentFuelInLiters);
            return currentFuelInLiters; 

        }
        
    }