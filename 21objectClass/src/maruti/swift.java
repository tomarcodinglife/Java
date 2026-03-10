package maruti;

public class Swift extends Maruti{

    public Swift(String color, int seatCapacity, String model, int manufecturingYear, int vehicle, int price){
    super(color, seatCapacity, model, manufecturingYear, vehicle, price);

    }

    public static void main(String[] args){
        Swift mySwift = new Swift("Black", 5, "Swift CNG", 2025, 4, 500000);


        System.out.print(mySwift);
        System.out.println(mySwift.getPrice());

        mySwift.setPrice(800000);
        System.out.print(mySwift);
        System.out.println(mySwift.getPrice());


    }



}