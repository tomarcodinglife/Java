package car.maruti;

import car.method.Car;

public class Maruti extends Car{
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Maruti(String colour, int seatCapacity, String model, int manufacturingYear, int vehicle, int price){
        // you can define in two types
        // super("Red", 5, "Swift", 2024, 4);
        super(colour, seatCapacity, model, manufacturingYear, vehicle);
        this.price = price;
    }

    public static void main(String[] args) {
        

    }

}
