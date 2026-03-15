package VehicleAbstraction;

public class Tata extends Car {
    private boolean isSUV;
    private boolean hasSunroof;
    private String engineType;

    public Tata(int noOfWheels, int noOfSeats, int manufacturingYear, String color, String model, String manufacturer, String fuelType, int mileage, boolean isSUV, boolean hasSunroof, String engineType) {
        super(noOfWheels, noOfSeats, manufacturingYear, color, model, manufacturer, fuelType, mileage);
        this.isSUV = isSUV;
        this.hasSunroof = hasSunroof;
        this.engineType = engineType;
    }

    @Override
    public void runVehicle() {
        System.out.println("The Tata vehicle is running efficiently.");
    }

}
