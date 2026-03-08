package car.carMethod;

public class CarMethodPublic {
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

    public CarMethodPublic(String carModel, String carManufactureCompany, int carManufacturingYear, int carSeat){
        this.carModel = carModel;
        this.carManufacturerCompany = carManufactureCompany;
        this.carManufacturingYear = carManufacturingYear;
        this.carSeat = carSeat;

        // Default Value
        this.carColour = "Black";
        this.carFuelType = "Petrol";
        this.carCurrentFuelLevel = 2;
        System.out.printf("Object Created by Car Method Third \n");
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

    void message(String msg){
        if (msg != null && !msg.isEmpty()) {
            System.out.println(msg);
        }else{
            System.out.println("Please Enter Valid Message");
        }
    }

    void message(String msg, int num){
        if (msg != null && num != 0 && !msg.isEmpty()) {
            System.out.println(msg + " :  " + num);
        }else{
            System.out.println("Please Enter Valid Message");
        }
    }

    // getter

    public String getCarColour() {
        return carColour;
    }

    // setter
    public void setCarColour(String carColour) {
        if (carColour != null && !carColour.isEmpty()) {
            this.carColour = carColour;
        }else{
            message("Invalid Details");
        }
        
    }


    public static void main(String[] args) {
        CarMethodPublic innova = new CarMethodPublic("G-SLF", "Toyota", 2023, 7);
        System.out.println(innova);


    }


    
}
