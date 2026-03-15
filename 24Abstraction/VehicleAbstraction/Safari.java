package VehicleAbstraction;

public class Safari extends Tata {

    public Safari(int noOfWheels, int noOfSeats, int manufacturingYear, String color, String model, String manufacturer, String fuelType, int mileage, boolean isSUV, boolean hasSunroof, String engineType) {
        super(noOfWheels, noOfSeats, manufacturingYear, color, model, manufacturer, fuelType, mileage, isSUV, hasSunroof, engineType);
    }   


    public static void main(String[] args) {
        
        Tata safari = new Tata(4, 7, 2020, "White", "Safari", "Tata Motors", "Diesel", 15, true, true, "2.0L Turbocharged");
        safari.runVehicle();


    }
    
}
