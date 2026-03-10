package method.Car;


public class Car{
    private String color;
    private int seatCapacity;
    private String model;
    private int manufecturingYear;
    private int vehicle;


    public Car(String color, int seatCapacity, String model, int manufecturingYear, int vehicle){

        this.color = color;
        this.seatCapacity = seatCapacity;
        this.model = model;
        this.manufecturingYear = manufecturingYear;
        this.vehicle = vehicle;
    }


    @Override 
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("Model : ").append(model).append("\n");
        return str.toString();
    }

    public int getSeatCapacity(){
        return seatCapacity;
    }

    public void setSeatCapacity(int seatCapacity){
        if(seatCapacity <= 0){
            System.out.print("Invalid Seat Please Enter Correct Capacity");
        }else{
            this.seatCapacity = seatCapacity;
        }
    }






}