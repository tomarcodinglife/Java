
import car.car;

public class driver {

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

        car Mercedes = new car();
        Mercedes.addFuel(8);
        Mercedes.start().drive();
        Mercedes.getCurrectFuelLevel();
    }


}