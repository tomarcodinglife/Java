package car.method;

public class Car {
    private String colour;
    private int seatCapacity;
    private String model;
    private int manufacturingYear;
    private int vehicle;
     

    public Car(String colour, int seatCapacity, String model, int manufacturingYear, int vehicle){
        this.colour = colour;
        this.seatCapacity = seatCapacity;
        this.model = model;
        this.manufacturingYear = manufacturingYear;
        this.vehicle = vehicle;
    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("Model : ").append(model).append("\n");
        return str.toString();
    }


    public int getSeatCapacity(){
        return seatCapacity;
    }

    public void setSeatCapacity(int seat){
        if(seat <= 0){
            System.out.print("Invalid Seat Capacity");
        }else{
             seatCapacity = seat;
        }
    }



}
