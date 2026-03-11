package heroBike;

public class HeroXtreme extends Hero {

    
    public HeroXtreme(String colour, int manufecturingYear, String model, int price){
        super(colour, manufecturingYear, model, price);
    }

    @Override
    public String toString(){
        return String.format ("Model : %s\nPrice : %d", model, price);
    }

    public static void main(String[] args) {
        HeroXtreme myBike = new HeroXtreme("Black", 2025, "EV", 150000);

        System.out.println(myBike);

        // Object Class
        System.out.println("toString : \n" + myBike.toString());
        // System.out.println("HashCode : " + myBike.hashCode());
        // System.out.println("getClass : " + myBike.getClass());


        

    }


}
