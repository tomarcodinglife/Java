package car.carMethod;

public class CarMethodFirst {
    private String carModel;
    private String carManufacturerCompany;
    private int carManufacturingYear;
    private String carColour;
    private String carFuelType;
    private int carCurrentFuelLevel;
    private int carPrice;
    private int carSeat;
    private int carInsurance;
    private int carRoadTax;
    private boolean carPollution;
    private boolean carInsuranceValid;
    private boolean carRoadTaxValid;
    private String carInsuranceCompany;
    
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
        System.out.printf("Object Created Done ");
        carPrice(500000);
    }

    @Override
    public String toString() {
        StringBuffer carIdentity = new StringBuffer();
        carIdentity.append("Model: ").append(carModel).append("\n");
        carIdentity.append("Manufacturer: ").append(carManufacturerCompany).append("\n");
        carIdentity.append("Year: ").append(carManufacturingYear).append("\n");
        carIdentity.append("Seat Capacity: ").append(carSeat).append("\n");
        carIdentity.append("Color: ").append(carColour).append("\n");
        carIdentity.append("Fuel Type: ").append(carFuelType).append("\n");
        carIdentity.append("Current Fuel Level: ").append(carCurrentFuelLevel).append("\n");
        return carIdentity.toString();
    }

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

    private int payCarInsurance(int years, int amount, String CompanyName){
        this.carInsuranceValid = true;
        int carInsuranceAmount = years * amount;
        this.carInsuranceCompany = CompanyName;
        System.out.printf("Car Insurence Done %s for %d years on %d", CompanyName, years, amount);
        return carInsuranceAmount;
    }

    private int payCarRoadTax (int years, int amount){
        this.carRoadTaxValid = true;
        int carRoadTaxAmount = years * amount;
        return carRoadTaxAmount;
    }


    // Getter & Setter
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
        System.out.println(Nexon);

        Nexon.setColor("White");
        Nexon.setFuelType("EV");
        Nexon.carPrice(1200000);

        System.out.println(Nexon);
        

    }

}
