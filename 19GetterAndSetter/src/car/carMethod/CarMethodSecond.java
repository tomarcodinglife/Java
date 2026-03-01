package car.carMethod;

public class CarMethodSecond {
    String carModel;
    String carManufacturerCompany;
    int carManufacturingYear;
    String carColour;
    String carFuelType;
    int carCurrentFuelLevel;
    int carPrice;
    int carSeat;
    int carInsurence;
    int carRoadTax;
    boolean carPolution;
    boolean carInsurenceValid;
    boolean carRoadTaxValid;
    String carInsurenceCompany;

    CarMethodSecond(String carModel, String carManufacturerCompany, int carManufacturingYear, int carSeat){
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
        StringBuffer str = new StringBuffer();
        str.append("Model").append(carModel);
        return str.toString();
    }



    void carPrice(int price){
        this.carPrice = price;
    }

    void carFuel(String fuelType){
        this.carFuelType = fuelType;
    }

    void setCarColour(String carColour) {
        if (carColour != null || !carColour.isEmpty()) {
            this.carColour = carColour;
        }else{

        }
    }

    


}
