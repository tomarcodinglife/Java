package car.car;

public class CarMethodFirst {
    private String carModel;
    private String carManufacturerCompany;
    private int carManufacturingYear;
    private String carColour;
    private String carFuelType;
    private int carCurrentFuelLevel;
    private int carPrice;
    private int carSeat;
    private int carInsurence;
    private int carRoadTax;
    private boolean carPolution;
    private boolean carInsurenceValid;
    private boolean carRoadTaxValid;
    private String carInsurenceCompany;

    // Wrapper Class Use
    private static void message(String msg, int...number){
        if (number.length == 0) {
            System.out.println(msg);
        }else{
            System.out.println(msg + number[0]);
        }
    }

    // Method
    private void carColour(String colour){
        this.carColour = colour;
    }

    private void carPrice(int carPrice){
        this.carPrice = carPrice;
    }

    private int payCarInsurence(int years, int amount, String CompanyName){
        this.carInsurenceValid = true;
        int carInsurenceAmount = years * 3000;
        this.carInsurenceCompany = CompanyName;
        System.out.printf("Car Insurence Done %s for %d years on %d", CompanyName, years, amount);
        return carInsurenceAmount;
    }

    private int payCarRoadTax (int years, int amount){
        this.carRoadTaxValid = true;
        int carRoadTaxAmount = years * amount;
        return carRoadTaxAmount;
    }


    // Constructor
    private CarMethodFirst (String carModel, String carManufacturerCompany, int carManufacturingYear, int carSeat) {
        this.carModel = carModel;
        this.carManufacturerCompany = carManufacturerCompany;
        this.carManufacturingYear = carManufacturingYear;
        this.carSeat = carSeat;

        // Default value
        this.carColour = "Black";
        this.carFuelType = "Petrol";
        this.carCurrentFuelLevel = 2;
        message("Object Created");
        carPrice(500000);
    }


    // Getter & Settor
    
    private void setColor(String Colour){
        if (Colour != null && !Colour.isEmpty()){   
            this.carColour = Colour;
        }else{
            message("Invalid Colour");
        }
    }

    private void setFuelType(String fuelType){
        this.carFuelType = fuelType;
    }


    // Main Method
    public static void main(String[] args) {
        CarMethodFirst Nexon = new CarMethodFirst("Nexon", "Tata",2012, 7);


    }

}
