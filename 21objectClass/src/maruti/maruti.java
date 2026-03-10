package maruti;
import method.Car.Car;


public class Maruti extends Car{
    private int price;

    public Maruti(String color, int seatCapacity, String model, int manufecturingYear, int vehicle, int price){
        super(color, seatCapacity, model, manufecturingYear, vehicle);
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        // if(price <= 0){
        //     System.out.print("Invalid Price");
        // }

        this.price = price;
    }

}

