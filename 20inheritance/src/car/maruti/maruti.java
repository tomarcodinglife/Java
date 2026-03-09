package car.maruti;

import car.method.Car;

public class maruti extends Car{
    private int price;

    public maruti(String colour, int seatCapacity, String model, int manufacturingYear, int vehicle, int price){
        // you can define in two types
        // super("Red", 5, "Swift", 2024, 4);
        super(colour, seatCapacity, model, manufacturingYear, vehicle);
        this.price = price;
    }

    public static void main(String[] args) {
        maruti Swift = new maruti("Red", 5, "Swift", 2024, 4, 50000);
        System.out.println(Swift);
        System.out.println(Swift.price);

    }

}
