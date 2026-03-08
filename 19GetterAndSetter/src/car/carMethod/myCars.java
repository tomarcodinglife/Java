package car.carMethod;
import car.carMethod.*;


public class myCars {
    
    public static void main(String[] args) {
        
        // Object with private constructor not wotk in other 
        // CarMethodPrivate Creta = new CarMethodPrivate("E(o)", "Hundai", 2023, 7);
        // System.out.println(Creta);


        // Object with default its work in same package 
        CarMethodDefault Punch = new CarMethodDefault("Smart CNG", "Tata", 2023, 5);
        System.out.println(Punch);


        // Object with public its work in same package
        CarMethodPublic Scorpio = new CarMethodPublic("Scarpio N", "Mahindra", 2024, 7);
        System.out.println(Scorpio);

    }

}
