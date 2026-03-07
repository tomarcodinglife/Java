package car.carMethod;
import car.carMethod.*;


public class myCars {
    
    public static void main(String[] args) {
        // Object with private constructor not wotk in other 
        // CarMethodFirst Creta = new CarMethodFirst("E(o)", "Hundai", 2023, 7);
        // System.out.println(Creta);

        // Object 
        CarMethodSecond Punch = new CarMethodSecond("Smart CNG", "Tata", 2023, 5);
        System.out.println(Punch);

        CarMethodThird Scorpio = new CarMethodThird("Scarpio N", "Mahindra", 2024, 7);
        System.out.println(Scorpio);

    }

}
