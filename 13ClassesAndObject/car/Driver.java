

package Car;

public class Driver {

    static int minAgeForDriving=18;
    int age;
    String name;
    String dateofLicence;

    public boolean isAllowedtoDrive(){
        return this.age >= minAgeForDriving;
    }

    public static void main(String[] args) {
        
        // car myCar = new Car();
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


        Car swift = new Car();
        swift.start().drive();
        System.out.println(swift.color);


        Car Safari = new Car("Red", 250);
        System.out.println("Safari Color : " + Safari.color);
    }

}