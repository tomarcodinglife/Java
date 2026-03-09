package car.maruti;

public class Swift extends Maruti {
    
    public Swift (String colour, int seatCapacity, String model, int manufacturingYear, int vehicle, int price){
        super(colour, seatCapacity, model, manufacturingYear, vehicle, price);
    }



    public static void main(String[] args) {
        
        Swift Swift = new Swift ("Red", 5, "Swift", 2024, 4, 50000);
        System.out.println(Swift);  // Swift
        System.out.println(Swift.getPrice());  // 50000

    }


}
