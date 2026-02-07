

import Car.Car;

public class Driver {

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
        // System.out.println(myCar.getCurrectFuelLevel());
        // myCar.drive();
        // myCar.drive();
        // myCar.drive();
        // myCar.addFuel(10);
        // myCar.drive();
        // System.out.println(myCar.getCurrectFuelLevel());

        Car Mercedes = new Car();
        Mercedes.addFuel(8);
        Mercedes.start().drive();
        Mercedes.getCurrectFuelLevel();
        
        Driver myDriver = new Driver();
        myDriver.dateofLicence = "01/January/2026";

    }

}