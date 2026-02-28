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
    private int payCarInsurence;
    private int payCarRoadTax;
    private boolean carPolution;
    private boolean carInsurenceValid;

    private static void message(String msg){
        System.out.print(msg);
    }

    private void carColour(String colour){
        this.carColour = colour;
    }

    private void carPrice(int carPrice){
        this.carPrice = carPrice;
    }

    private int doCarInsurence(int years){
        this.carInsurenceValid = true;
        int carInsurenceAmount = years * 3000;
        System.out.print("Paid Amount" + carInsurenceAmount);
        return carInsurenceAmount;
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


    // Main Mrthod
    public static void main(String[] args) {
        CarMethodFirst Nexon = new CarMethodFirst("Nexon", "Tata",2012, 7);


    }

}
