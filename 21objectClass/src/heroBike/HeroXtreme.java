package heroBike;

public class HeroXtreme extends Hero {
    
    public HeroXtreme(String colour, int manufecturingYear, String model, int price){
        super(colour, manufecturingYear, model, price);
    }

    public static void main(String[] args) {
        HeroXtreme myBike = new HeroXtreme("Black", 2025, "EV", 150000);

        System.out.println(myBike);

        

    }


}
