package car.carMethod;

public class CarMethodThird {
    private final String carModel;
    private final String carManufacturerCompany;
    private final int carManufacturingYear;
    private String carColour;
    private String carFuelType;
    private int carCurrentFuelLevel;
    private int carPrice;
    private final int carSeat;
    private int carInsurance;
    private int carRoadTax;
    private boolean carPollution;
    private boolean carInsuranceValid;
    private boolean carRoadTaxValid;
    private String carInsurenceCompany;

    CarMethodThird(String carModel, String carManufactureCompany, int carManufacturingYear, int carSeat){
        this.carModel = carModel;
        this.carManufacturerCompany = carManufactureCompany;
        this.carManufacturingYear = carManufacturingYear;
        this.carSeat = carSeat;

        // Default Value
        this.carColour = "Black";
        this.carFuelType = "Petrol";
        this.carCurrentFuelLevel = 2;
        System.out.printf("Object Created by Car Method Third");
    }

    @Override
    public String toString() {
        StringBuilder myStr = new StringBuilder();
        myStr.append("Car Model : ").append(carModel).append("\n");
        myStr.append("Car Manufacture Company : ").append(carManufacturerCompany).append("\n");
        myStr.append("Car Manufacture Year: ").append(carManufacturingYear).append("\n");
        myStr.append("Car Seat: ").append(carSeat).append("\n");
        return myStr.toString();
    }








    
}
