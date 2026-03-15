package Transport;

public class Vehicle implements Transport {
    private String vehicleType;
    private String manufacturer;
    private int manufacturingYear;
    private int numberOfWheels;

    public Vehicle(String vehicleType, String manufacturer, int manufacturingYear, int numberOfWheels) {
        this.vehicleType = vehicleType;
        this.manufacturer = manufacturer;
        this.manufacturingYear = manufacturingYear;
        this.numberOfWheels = numberOfWheels;
    }


    @Override
    public void start() {
        System.out.println("Vehicle is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Vehicle is stopping.");
    }

    @Override
    public void accelerate() {
        System.out.println("Vehicle is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("Vehicle is braking.");
    }

    
}