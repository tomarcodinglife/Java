package Transport;

public class Car extends Vehicle {
    private String color;

    
    public Car(String vehicleType, String manufacturer, int manufacturingYear, int numberOfWheels, String color) {
        super(vehicleType, manufacturer, manufacturingYear, numberOfWheels);
        this.color = color;
    }

    


}
