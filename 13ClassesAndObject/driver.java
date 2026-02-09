

import Car.Car;

public class driver {

    static int minAgeForDriving=18;
    int age;
    String name;
    String dateofLicence;

    public boolean isAllowedtoDrive(){
        return this.age >= minAgeForDriving;

    }

    public static void main(String[] args) {
        
        // car myCar = new car();
        // myCar.addFuel(5);
        // myCar.drive();
        // System.out.println(myCar.getCurrentFuelLevel());
        // myCar.drive();
        // myCar.drive();
        // myCar.drive();
        // myCar.addFuel(10);
        // myCar.drive();
        // System.out.println(myCar.getCurrentFuelLevel());

        // Car Mercedes = new Car();
        // Mercedes.addFuel(8);
        // Mercedes.start().drive();
        // Mercedes.getCurrentFuelLevel();
        
        // Driver myDriver = new Driver();
        // myDriver.dateofLicence = "01/January/2026";


        Car swift = new Car(color:"Black", maxSpeed:250);
        swift.start().drive();
        // System.out.print(swift.color)


    }

}