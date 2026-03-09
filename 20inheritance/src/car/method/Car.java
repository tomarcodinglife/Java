package car.method;

public class Car {
    protected String colour;
    protected double price;
    protected int seatCapacity;

    public int getSeatCapacity(){
        return seatCapacity;
    }

    public void setSeatCapacity(int seat){
        if(seat != 4){
            System.out.print("Invalid Seat Capacity");
        }else{
             seatCapacity = seat;
        }
    }



}
