package car.carMethod;

public class CarMethodSecond {
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
        setCarPrice(500000);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Model").append(carModel).append("\n");
        str.append("Manufacturer").append(carManufacturerCompany).append("\n");
        str.append("Color").append(carColour).append("\n");
        str.append("Fuel Type").append(carFuelType).append("\n");
        str.append("Fuel Level").append(carCurrentFuelLevel).append("\n");

        return str.toString();
    }

    void message(String msg, int ...number){
        if (number.length == 0) {
            System.out.println(msg);
        }else{
            System.out.println(msg + number[0]);
        }
    }

    void carFuel(String fuelType){
        this.carFuelType = fuelType;
    }

    void carColour(String carColour) {
        if (carColour != null && !carColour.isEmpty()) {
            this.carColour = carColour;
        }else{
            message("Invalid Colour");;
        }
    }

    void setCarColour(String colour){
        if (colour != null && !colour.isEmpty()) {
            this.carColour = colour;
        }else{
            message("Invalid Colour");
        }
    }

    // void setCarPrice(int price){
    //     if (price != 0 && price <= 5000000) {
    //         this.carPrice = price;
    //     }else{
    //         message("Please Enter Valid Amount");
    //     }
    // }

    // Getter Setter 

    public int getCarPrice(){
        return carPrice;
    }

    public void setCarPrice(int price){
        if (price != 0 && price <= 5000000) {
            this.carPrice = price;
        }else{
            message("Please Enter Valid Amount");
        }
        // this.carPrice = price;
    }


    public static void main(String[] args) {
        

    }


}
