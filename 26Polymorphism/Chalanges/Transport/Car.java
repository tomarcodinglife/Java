package Chalanges.Transport;

public class Car extends Vehicle {
    
    @Override
    public void Service() {
        super.Service();
        System.out.println("Car is being serviced.");
    }
    
}
